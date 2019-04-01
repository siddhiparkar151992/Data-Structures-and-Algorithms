package main.java.amazon;

import java.util.Arrays;

public class HuffmanCoding {
	public HuffmanNode extractMin(HuffmanNode[] heap) {
		HuffmanNode node = heap[0];
		HuffmanNode[] newHeap = new HuffmanNode[heap.length - 1];
		for (int i = 1; i < heap.length; i++) {
			newHeap[i - 1] = heap[i];
		}
		heap = newHeap;
		return node;

	}

	public void minheapify(HuffmanNode[] arr, int i) {
		int min = i;
		int l = 2 * i;
		int r = l + 1;
		if (l < arr.length && arr[l].freq < arr[min].freq) {
			min = l;
		}
		if (r < arr.length && arr[r].freq < arr[min].freq) {
			min = r;
		}

		if (min != i) {
			HuffmanNode temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			minheapify(arr, min);
		}
	}

	public void buildHeap(HuffmanNode[] arr) {
		int n = arr.length;
		for (int i = n / 2; i >= 0; i--) {
			minheapify(arr, i);
		}
	}

	public void sort(HuffmanNode[] arr) {
		int n = arr.length;
		buildHeap(arr);
		for (int i = n - 1; i >= 0; i--) {
			HuffmanNode temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			minheapify(arr, i);
		}
	}

	public HuffmanNode[] addNode(HuffmanNode[] heap, HuffmanNode node) {
		HuffmanNode[] newHeap = new HuffmanNode[heap.length + 1];
		boolean found = false;
		for (int i = 0; i < newHeap.length; i++) {
			if (!found && i >= heap.length) {
				newHeap[i] = node;
				break;
			}
			if (!found && node.freq < heap[i].freq) {
				found = true;
				newHeap[i] = node;
				continue;
			} else if (found) {
				newHeap[i] = heap[i - 1];
			} else {
				newHeap[i] = heap[i];
			}
		}
		return newHeap;
	}

	public HuffmanNode compress(HuffmanNode[] nodes) {
		buildHeap(nodes);
		while (nodes.length > 1) {
			HuffmanNode left = extractMin(nodes);
			nodes = Arrays.copyOfRange(nodes, 1, nodes.length);
			HuffmanNode right = extractMin(nodes);
			nodes = Arrays.copyOfRange(nodes, 1, nodes.length);
			HuffmanNode top = new HuffmanNode();
			top.freq = left.freq + right.freq;
			top.data = "$";
			top.left = left;
			top.right = right;

			nodes = addNode(nodes, top);
		}
		
		return nodes[0];

	}

	public void printCodesRrc(HuffmanNode tree, String codes) {
		if (tree == null) {
			System.out.println(codes);
		}
		if (tree.left == null && tree.right == null) {
			System.out.println(codes);
			return;
		}

		printCodesRrc(tree.left, codes.concat("0"));

		printCodesRrc(tree.right, codes.concat("1"));

	}

	public void printCodes(HuffmanNode tree) {
		printCodesRrc(tree, "");
	}

	public static void main(String[] args) {
		HuffmanNode[] nodes = new HuffmanNode[6];
		HuffmanNode node1 = new HuffmanNode();
		node1.setData("a");
		node1.setFreq(5);
		nodes[0] = node1;

		HuffmanNode node2 = new HuffmanNode();
		node2.setData("b");
		node2.setFreq(9);
		nodes[1] = node2;

		HuffmanNode node3 = new HuffmanNode();
		node3.setData("c");
		node3.setFreq(12);
		nodes[2] = node3;

		HuffmanNode node4 = new HuffmanNode();
		node4.setData("d");
		node4.setFreq(13);
		nodes[3] = node4;

		HuffmanNode node5 = new HuffmanNode();
		node5.setData("e");
		node5.setFreq(16);
		nodes[4] = node5;

		HuffmanNode node6 = new HuffmanNode();
		node6.setData("f");
		node6.setFreq(45);
		nodes[5] = node6;
		HuffmanCoding h = new HuffmanCoding();
		h.compress(nodes);
		h.printCodes(nodes[0]);
	}

}
