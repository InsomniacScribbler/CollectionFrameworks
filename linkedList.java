import java.util.Arrays;
import java.util.LinkedList;

public class linkedList {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();

		l1.add(1);
		l1.add(3);
		l1.add(2);
		l1.add(6);
		System.out.println(l1);
		System.out.println(l1.get(2)); // O(n)
		l1.addLast(10);
		System.out.println(l1.getLast());//O(1)
		l1.addFirst(0);
		System.out.println(l1.getFirst());
		System.out.println(l1);

//		l1.removeIf(x -> x%2 ==0);
//		System.out.println(l1);

		LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog", "Bat","Cat" , "Elephant"));
		System.out.println(animals);
		LinkedList<String> animalstoRemove = new LinkedList<>(Arrays.asList( "Cat" , "Elephant"));
		animals.removeAll(animalstoRemove);
		System.out.println(animals);
	}
}
