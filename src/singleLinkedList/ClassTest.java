package singleLinkedList;

import doubleLinkedList.DoubleLinkedList;

public class ClassTest {

	public static void main(String[] args) {

		DoubleLinkedList list = new DoubleLinkedList();
		
		list.append(1);
		list.append(23);
		list.append(21);
		list.append(42);
		
		System.out.println(list.printReverse());
		
	}

}
