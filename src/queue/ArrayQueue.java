package queue;

public class ArrayQueue implements QueueInterface {

	private int size;
	private int header = -1;
	private int tail = -1;
	private int[] array;

	public ArrayQueue() {
		array = new int[size];
	}

	public ArrayQueue(int size) {
		array = new int[size];
	}

	@Override
	public void enqueue(Integer data) {
		if (isFull()) {
			resize();
		}
		if (isEmpty()) {
			header = 0;
			tail = 0;
			array[0] = data;
			size++;
		} else {
			tail = (tail + 1) % array.length;
			array[tail] = data;
			size++;
		}

	}

	private void resize() {

	}

	@Override
	public Integer dequeue() {

		if (isEmpty()) {
			return null;
		} else if (header == tail) {
			int temp = array[header];
			header = -1;
			tail = -1;
			size--;
			return temp;
		} else {
			int temp = array[header];
			header = (header + 1) % array.length;
			size--;
			return temp;
		}

	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean isFull() {
		return array.length == size;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Integer peek() {
		// TODO Auto-generated method stub
		return null;
	}

}
