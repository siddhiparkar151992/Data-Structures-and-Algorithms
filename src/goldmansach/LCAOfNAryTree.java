package goldmansach;

import java.util.LinkedList;
import java.util.List;

public class LCAOfNAryTree {

	public class NAryNode {
		int data;
		List<NAryNode> children = new LinkedList<>();

		public NAryNode(int data) {
			super();
			this.data = data;
		}

	}

	public void addEgge(NAryNode toNode, int value) {
		NAryNode n = new NAryNode(value);
		toNode.children.add(n);
	}

	public void DFS(int[] depth, NAryNode curr, int d) {
		if (curr == null)
			return;
		depth[curr.data] = d;
		for (int i = 0; i < curr.children.size(); i++) {
			DFS(depth, curr.children.get(i), d + 1);
		}
	}

	public void DFSParent(int[] depth, int[] parent, NAryNode curr, NAryNode pre, int d) {
		if (curr == null)
			return;
		parent[curr.data] = pre != null ? pre.data : -1;
		depth[curr.data] = d;
		for (int i = 0; i < curr.children.size(); i++) {
			DFSParent(depth, parent, curr.children.get(i), curr, d + 1);
		}
	}

	public int lca(int u, int v, int[] depth, int[] parent) {
		if (u == v)
			return u;
		if (depth[u] > depth[v]) {
			u = parent[u];
		} else if (depth[u] == depth[v]) {
			u = parent[u];
			v = parent[v];
		}
		return lca(u, v, depth, parent);
	}

	public void prepare() {
		NAryNode root = new NAryNode(1);
		root.children.add(new NAryNode(2));
		root.children.add(new NAryNode(3));
		root.children.add(new NAryNode(4));
		root.children.get(0).children.add(new NAryNode(5));
		root.children.get(1).children.add(new NAryNode(6));
		root.children.get(1).children.add(new NAryNode(7));
		root.children.get(2).children.add(new NAryNode(8));

		int[] depth = new int[9];
		int[] parent = new int[9];
		DFSParent(depth, parent, root, null, 0);
		System.out.println(lca(6, 4, depth, parent));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCAOfNAryTree l = new LCAOfNAryTree();
		l.prepare();
	}

}
