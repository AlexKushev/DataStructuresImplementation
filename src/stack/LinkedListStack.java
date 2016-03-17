package stack;

import doubleLinkedList.Node;

public class LinkedListStack implements StackInterface {

	private Node header;
	private int size;

	public LinkedListStack() {
		header = new Node(null);
	}

	@Override
	public void push(Integer data) {
		Node n = new Node(data);
		if (size == 0) {
			header.next = n;
			size++;
		} else {
			Node temp = header.next;
			header.next = n;
			n.next = temp;
			size++;
		}
	}

	@Override
	public Integer pop() {
		if (size == 0) {
			return null;
		} else {
			int temp = header.next.data;
			header.next = header.next.next;
			size--;
			return temp;
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public Integer peak() {
		if (size != 0)
			return header.next.data;
		return null;
	}

	public String toString() {
		Node n = header.next;
		String string = "[";
		while (n != null) {
			string = string + n.data;
			n = n.next;
			if (n != null) {
				string = string + ", ";
			} else {
				string = string + "]";
			}
		}
		return string;
	}

}
