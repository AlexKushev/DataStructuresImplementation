package stack;

public class TestClass {

	public static void main(String[] args) {

		StackInterface stack = new LinkedListStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.push(12);

		System.out.println(stack.toString());

		StackInterface stackArray = new ArrayStack();
		stackArray.push(1);
		stackArray.push(2);
		stackArray.push(3);
		stackArray.push(4);
		stackArray.push(5);
		stackArray.pop();
		stackArray.push(12);

		System.out.println(stackArray.toString());

	}

}
