package stack;

public class ArrayStack implements StackInterface {

	private int[] array;
	private int top = -1;
	private int size;

	public ArrayStack(int size) {
		array = new int[size];
	}

	public ArrayStack() {
		size = 3;
		array = new int[3];
	}

	@Override
	public void push(Integer data) {

		if (top == array.length - 1) {
			resize();
		}
		top++;
		array[top] = data;
		size++;

	}

	@Override
	public Integer pop() {
		if (isEmpty()) {
			return null;
		}
		int temp = array[top];
		top--;
		size--;
		return temp;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void resize() {
		int[] temp = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	@Override
	public Integer peak() {
		if (isEmpty()) {
			return null;
		}
		return array[top];
	}

	public String toString() {
		String string = "";
		for (int i = 0; i <= top; i++) {
			string = string + array[i] + " ";
		}
		return string;
	}

}
