package main.java.algorithm.morganstanley;

public class RedBalckTree {
	public Node root;
	public Node currentInserted;

	public class Node {
		public int color;
		public int key;
		public Node left;
		public Node right;
		public Node parent;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + color;
			result = prime * result + key;
			result = prime * result + ((left == null) ? 0 : left.hashCode());
			result = prime * result + ((parent == null) ? 0 : parent.hashCode());
			result = prime * result + ((right == null) ? 0 : right.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (color != other.color)
				return false;
			if (key != other.key)
				return false;
			if (left == null) {
				if (other.left != null)
					return false;
			} else if (!left.equals(other.left))
				return false;
			if (parent == null) {
				if (other.parent != null)
					return false;
			} else if (!parent.equals(other.parent))
				return false;
			if (right == null) {
				if (other.right != null)
					return false;
			} else if (!right.equals(other.right))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Node [color=" + color + ", key=" + key + ", left=" + left + ", right=" + right + ", parent="
					+ parent + "]";
		}

		public Node(int key) {
			this.key = key;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node getParent() {
			return parent;
		}

		public void setParent(Node parent) {
			this.parent = parent;
		}

		private RedBalckTree getOuterType() {
			return RedBalckTree.this;
		}

	}

	public void rightTraverse(Node x) {

	}

	public void rightRotate(Node x) {
		Node parent = x.parent;
		if (x.parent == null || x.parent.left != x) {
			Node currRoot = x;
			x = x.left;
			x.right = currRoot;
			x.parent = parent;
			x.right.parent = x;
			x.right.left = null;
			return;

		}
		rightRotate(x.parent);
	}

	public void leftRotate(Node x) {
		Node parent = x.parent;
		if (x.parent == null || x.parent.right != x) {
			Node currRoot = x;
			x = x.right;
			x.left = currRoot;
			x.parent = parent;
			x.left.parent = x;
			if (parent != null && parent.left == currRoot) {
				x.parent.left = x;
			} else {
				x.parent.right = x;
			}
			return;

		}
		leftRotate(x.parent);
	}

	public void recolor(Node x) {
		if (this.root.key == x.key) {
			this.root.color = 1;
		} else if (x.parent.color != 1 || root.key != x.key) {
			Node uncle = null;
			if (x.parent != null && x.parent.parent != null && x.parent.parent.left != x.parent) {
				uncle = x.parent.parent.left;
			}else if (x.parent != null && x.parent.parent != null && x.parent.parent.right!= x.parent) {
				uncle = x.parent.parent.right;
			} else if (x.parent != null && x.parent.parent != null) {
				uncle = x.parent.parent.right;
			}
			if (uncle != null) {
				if (uncle.color == 0) {
					uncle.color = 1;
					x.parent.color = 1;
					x = x.parent.parent;
					recolor(x);
				} else {
					if (x.parent == x.parent.parent.left && x == x.parent.left) {
						rightRotate(x);
					} else if (x.parent == x.parent.parent.left && x == x.parent.right) {
						leftRotate(x);
						rightRotate(x);
						System.out.println();
					} else if (x.parent == x.parent.parent.right && x == x.parent.right) {
						leftRotate(x);

					} else if (x.parent == x.parent.parent.right && x == x.parent.left) {
						rightRotate(x);
						leftRotate(x);

					}

				}

			}
		}
	}

	public void insert(int n) {
		if (this.root == null) {
			this.root = new Node(n);
			return;
		}
		insertRec(root, n);
		recolor(currentInserted);
	}

	public Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			root.color = 0;
			currentInserted = root;
			return root;
		}
		if (key < root.key) {
			root.left = insertRec(root.left, key);
			if (root.left != null)
				root.left.parent = root;

		} else if (key > root.key)
			root.right = insertRec(root.right, key);
		if (root.right != null)
			root.right.parent = root;

		return root;
	}

	public static void main(String[] arg) {
		RedBalckTree r = new RedBalckTree();
		r.insert(5);
		r.insert(3);
		r.insert(7);
		r.insert(4);

	}
}
