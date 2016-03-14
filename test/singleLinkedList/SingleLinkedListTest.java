package singleLinkedList;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SingleLinkedListTest {

	private SingleLinkedList list;
	private List<Integer> l;

	@Before
	public void setup() {
		list = new SingleLinkedList();
		l = new LinkedList<Integer>();
	}

	@Test
	public void testSingleLinkedListSize() {
		list.append(3);
		list.append(4);
		assertEquals(2, list.getSize());
	}

	@Test
	public void testSingleLinkedListAppend() {
		list.append(21);
		list.append(32);
		l.add(21);
		l.add(32);
		assertEquals(l.toString(), list.toString());
	}

	@Test
	public void testSingleLinkedListRemoveFirstMethod() {
		list.append(21);
		list.append(23);
		list.append(52);
		list.removeFirst();
		l.add(21);
		l.add(23);
		l.add(52);
		l.remove(0);
		assertEquals(2, list.getSize());
		assertEquals(l.toString(), list.toString());
	}

	@Test
	public void testSingleLinkedListRemoveLastMethod() {
		list.append(21);
		list.append(23);
		list.append(52);
		list.removeLast();
		l.add(21);
		l.add(23);
		l.add(52);
		l.remove(l.size() - 1);
		assertEquals(2, list.getSize());
		assertEquals(l.toString(), list.toString());
	}

}
