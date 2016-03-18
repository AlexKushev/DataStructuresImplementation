package queue;

public interface QueueInterface {

	public void enqueue(Integer data);

	public Integer dequeue();

	public boolean isEmpty();

	public int getSize();

	public Integer peek();

}
