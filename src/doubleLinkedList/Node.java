package doubleLinkedList;

public class Node {
	public Integer data;
	public Node next;
	public Node previous;
	
	public Node(Integer data){
		this.data = data;
		next = null;
		previous = null;
	}
}
