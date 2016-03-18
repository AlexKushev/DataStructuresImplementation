package queue;

public class TestClass {

	public static void main(String[] args) {
		QueueInterface testQueue = new ArrayQueue(3);
		testQueue.enqueue(1);
		testQueue.enqueue(2);
		testQueue.enqueue(3);
		testQueue.enqueue(4);
		testQueue.enqueue(5);
		testQueue.dequeue();
		System.out.println(testQueue.toString());

	}

}
