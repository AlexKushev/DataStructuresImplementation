package linkedList;

public class TestClass {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();

		list.append(5);
		list.append(4);
		list.append(3);
		list.removeFirst();
		list.removeFirst();

		System.out.println(list);
	}

}
