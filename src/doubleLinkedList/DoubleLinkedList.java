package doubleLinkedList;

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

	public void insertAt(int position, Integer data) {
		if (position <= 0 || position > size) {
			return;
		} else if (position == size) {
			append(data);
		} else {
			Node n = new Node(data);
			Node x = header.next;
			int count = 1;
			while (count != position - 1) {
				x = x.next;
				count++;
			}

			Node temp = x.next;
			x.next = n;
			n.previous = x;
			n.next = temp;
			n.next.previous = n;
			size++;
		}
	}

	public void removeAt(int index) {
		if ((index <= 0) || (index > size)) {
			return;
		} else if (index == 1) {
			removeFirst();
		} else if (index == size) {
			removeLast();
		} else {
			Node n = header.next;
			int count = 1;
			while (count != index - 1) {
				n = n.next;
				count++;
			}
			n.next = n.next.next;
			n.next.previous = n;
			size--;
		}
	}

	public String printReverse() {
		Node n = lastNode;
		String string = "";
		while (n != header){
			string = string + n.data + " ";
			n = n.previous;
		}
		
		return string;
		
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
