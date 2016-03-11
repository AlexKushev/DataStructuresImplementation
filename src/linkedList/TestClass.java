package linkedList;

public class TestClass {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();

		list.append(5);
		list.append(4);
		list.append(3);
		list.removeLast();
		System.out.println(list);
	}

}
