package main.java.amazon;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	private Map<Integer, Node> hash;
	private DoublyLinkedList queue;
	private int pageCount;

	public LRUCache(int cacheSize) {
		this.pageCount = cacheSize;
		hash = new HashMap<Integer, Node>();
		queue = new DoublyLinkedList(cacheSize);
	}

	static class Node {
		int pageNumber;
		Node prev;
		Node next;

		public Node(int data) {
			this.pageNumber = data;
		}
		
		@Override
		public String toString(){
			return String.valueOf(pageNumber)+" ";
		}

	}

	class DoublyLinkedList {
		int count;
		int currCount;
		Node front, rear;
		
		
		public DoublyLinkedList(int num) {
			this.count = num;
		}

		public void printList() {
			if (queue.front == null) {
				return;
			}
			Node tmp = queue.front;
			while (tmp != null) {
				System.out.print(tmp);
				tmp = tmp.next;
			}
		}

		public void dequeue() {
			if (queue.rear == queue.front) {
				queue.count = 0;
				queue.front = queue.rear = null;
				return;
			} else {
				queue.rear.prev.next = null;
				queue.rear = queue.rear.prev;
			}

			queue.count -= 1;
		}

		public Node enqueue(int data) {
			Node node = new Node(data);

			if (queue.front == null) {
				queue.rear = queue.front = node;

			} else {

				node.next = queue.front;
				queue.front = node;
				queue.front.next.prev = node;

			}
			queue.currCount += 1;
			return node;
		}

		public void movePageToStart(Node page) {
			if (page == queue.front)
				return;
			if (queue.rear == page) {
				page.prev.next = null;
				queue.rear = page.prev;

			}
			Node next = page.next;
			Node pre = page.prev;

			pre.next = next;
			if (next != null) {
				next.prev = pre;
			}

			page.prev = null;

			page.next = queue.front;
			queue.front.prev = page;
			queue.front = page;
		}
		
	}

	public void accessPage(Integer pageNum) {
		Node page = hash.get(pageNum);
		if (page == null) {
			if (queue.currCount == queue.count) {
				hash.remove(queue);
				
				queue.dequeue();
				page = queue.enqueue(pageNum);
			} else {
				page = queue.enqueue(pageNum);
			}
			
			hash.put(pageNum, page);

		} else {
			queue.movePageToStart(page);
			hash.put(pageNum, queue.front);
		}
	}

	public void printCacheState() {
		queue.printList();
		System.out.println();
	}

	public static void main(String[] args) {
		int cacheSize = 4;
		LRUCache cache = new LRUCache(cacheSize);
		cache.accessPage(4);
		cache.printCacheState();
		cache.accessPage(2);
		cache.printCacheState();
		cache.accessPage(1);
		cache.printCacheState();
		cache.accessPage(1);
		cache.printCacheState();
		cache.accessPage(4);
		cache.printCacheState();
		cache.accessPage(3);
		cache.printCacheState();
		cache.accessPage(7);
		cache.printCacheState();
		cache.accessPage(8);
		cache.printCacheState();
		cache.accessPage(3);
		cache.printCacheState();
	}

}
