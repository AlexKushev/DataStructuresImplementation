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
