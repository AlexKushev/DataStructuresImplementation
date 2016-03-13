package doubleLinkedList;

import doubleLinkedList.Node;

public class DoubleLinkedList {

	private Node header;
	private Node lastNode;
	int size;

	public DoubleLinkedList() {
		header = new Node(null);
		lastNode = header;
		size = 0;
	}

	public void append(Integer data) {
		Node n = new Node(data);
		if (size == 0) {
			header.next = n;
			lastNode = n;
			n.previous = header;
			size++;
		} else {
			lastNode.next = n;
			n.previous = lastNode;
			lastNode = n;
			size++;
		}
	}

	public void removeFirst() {
		if (size != 0) {
			header.next = header.next.next;
			header.next.next.previous = header;
			size--;
		}
	}

	public void removeLast() {
		if (size == 1) {
			header.next = null;
			lastNode = header;
			size--;
		} else if (size != 0) {
			lastNode.previous.next = null;
			lastNode = lastNode.previous;
			size--;
		}
	}

	public int getSize() {
		return this.size;
	}

	public String toString() {
		Node n = header.next;
		String string = "";
		while (n != null) {
			string = string + n.data + " ";
			n = n.next;
		}
		return string;
	}

}
