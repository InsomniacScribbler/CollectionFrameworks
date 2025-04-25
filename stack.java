import java.util.LinkedList;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();

		s1. push(1);
		s1. push(12);
		s1. push(13);
		s1. push(14);
		s1. push(15);
		s1. push(16);
		s1. push(17);
		s1. push(18);
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		System.out.println(s1.search(2));

		LinkedList<Integer> stackLL = new LinkedList<>();
		stackLL.addLast(1);
		stackLL.addLast(2);
		stackLL.addLast(3);
		stackLL.addLast(4);
		stackLL.addLast(5);
		System.out.println(stackLL.getLast()); // peek
		System.out.println(stackLL.removeLast()); //pop
		System.out.println(stackLL.getLast());
	}
}
