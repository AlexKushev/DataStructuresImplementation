package linkedList;

public class TestClass {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();

		list.append(5);
		list.append(4);
		list.append(3);
		list.append(6);
		list.insertAt(3, 100);
		list.insertAt(5, 12512);
		list.insertAt(5, 0);
		list.removeAt(1);
		list.removeAt(list.getSize());
		System.out.println(list);
	}

}
