package queue;

import doubleLinkedList.Node;

public class LinkedListQueue implements QueueInterface {

	private Node head;
	private Node tail;
	private int size;

	public LinkedListQueue() {
		head = new Node(null);
		tail = head;
	}

	@Override
	public void enqueue(Integer data) {
		Node n = new Node(data);
		if (size == 0) {
			head.next = n;
			tail = n;
			size++;
		} else {
			tail.next = n;
			tail = n;
			size++;
		}
	}

	@Override
	public Integer dequeue() {
		if (size != 0) {
			int temp = head.next.data;
			head.next = head.next.next;
			size--;
			return temp;
		}
		return null;

	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Integer peek() {
		if (size != 0) {
			return head.next.data;
		}
		return null;
	}

}
