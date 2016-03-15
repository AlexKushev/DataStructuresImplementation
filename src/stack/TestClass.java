package stack;

public class TestClass {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.push(12);
		
		
		System.out.println(stack.toString());
		
	

	}

}
