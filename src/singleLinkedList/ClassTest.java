package singleLinkedList;

import java.util.LinkedList;
import java.util.List;

public class ClassTest {

	public static void main(String[] args) {

		SingleLinkedList list = new SingleLinkedList();
		
		list.append(1);
		list.append(23);
		list.append(21);
		list.append(42);
		
		List<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(23);
		l.add(21);
		l.add(42);
		
		
		System.out.println(list.toString());
		System.out.println(l.toString());
		
		
		
	}

}
