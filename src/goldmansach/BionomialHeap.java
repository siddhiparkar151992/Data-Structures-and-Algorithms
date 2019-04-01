package goldmansach;

public class BionomialHeap {

	public class Node {
		int data, degree;
		Node child, parent, sibling;
		@Override
		public String toString() {
			return "Node [degree=" + degree + "]";
		}

	}

	Node root;

	public void union(Node node) {
		merge(node);
		Node pre = null;
		Node curr = root;
		Node next = curr.sibling;
		while (next != null) {
			if (curr.degree == next.degree) {
				pre = curr;
				curr = next;
			} else {
				if (next.sibling != null && next.sibling.degree == curr.sibling.degree) {
					pre = curr;
					curr = next;
				} else if (curr.degree <= next.degree) {
					curr.sibling = next.sibling;
					next.parent = curr;
					curr.child = next;
					next.sibling = curr.child;
					curr.degree++;
				} else {
					if (pre == null) {
						root = next;
					} else {
						pre.sibling = next;
					}

					curr.parent = next;
					curr.sibling = next.child;
					next.child = curr;
					next.degree++;
					curr = next;

				}
			}
			next = curr.sibling;
		}
	}

	private void merge(Node node) {
		Node node1 = root;
		Node node2 = node;
		if(root == null){
			root = node;
			return;
		}
		while (node1 != null && node2 != null) {
			if (node1.degree == node2.degree) {
				Node temp = node2;
				node2 = node2.sibling;
				temp.sibling = node1.sibling;
				node1.sibling = temp;
				node1 = temp.sibling;

			} else if (node1.degree < node2.degree) {
				if (node1.sibling!=null && node1.sibling.degree < node2.degree) {
					node1 = node1.sibling;
				} else {
					Node temp = node2;
					node2 = node2.sibling;
					temp.sibling = node1.sibling;
					node1.sibling = temp;
					node1 = temp.sibling;
				}

			}else{
				Node temp = node1;
				node1 = node1.sibling;
				temp.sibling = node2.sibling;
				node2.sibling = temp;
				node2 = temp.sibling;
				if(temp == root){
					root = node1;
				}
			}
		}
		
		if(node1==null){
			node1 = root;
			while(node1!=null){
				node1 = node1.sibling;
			}
			
			if(node1!=null)node1.sibling = node2;
		}
	}

	public void insert(int val) {
		Node node = new Node();
		node.degree = val;
		union(node);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BionomialHeap b = new BionomialHeap();
		b.insert(73);
		b.insert(19);
		b.insert(24);
		System.out.println();
	}

}
