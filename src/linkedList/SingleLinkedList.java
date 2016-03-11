package linkedList;

public class SingleLinkedList {

	private Node header;
	private Node lastNode;
	private int size;

	public SingleLinkedList() {
		header = new Node(null);
		lastNode = header;
		this.size = 0;
	}

	public void append(Integer data) {
		Node n = new Node(data);

		if (size == 0) {
			header.next = n;
			lastNode = n;
			size++;
		} else {
			lastNode.next = n;
			lastNode = n;
			size++;
		}
	}

	public void removeFirst() {
		if (size != 0) {
			header.next = header.next.next;
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
