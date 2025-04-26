import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<>();
		m1.put(56, "joshi");
		m1.put(1, "Sujit");
		m1.put(2, "Nikhil");
		System.out.println(m1);

		System.out.println();
		System.out.println("Value for key 2: " + m1.get(2));

		System.out.println("Does key 3 exist?: " + m1.containsKey(3));
		System.out.println();

		System.out.println("Printing all values using keySet():");
		for (int key : m1.keySet()) {
			System.out.println(m1.get(key));
		}

		System.out.println();
		System.out.println("Printing all values in UPPERCASE using entrySet():");
		for (Map.Entry<Integer, String> entry : m1.entrySet()) {
			System.out.println(entry.getValue().toUpperCase());
		}

		// Removing an entry
		boolean res = m1.remove(31, "Nitin"); // Will not remove anything, key not present
		System.out.println("\nREMOVED? : " + res);
		System.out.println("Map after remove attempt: " + m1);

		// -----------------------------------------------
		// Now create a new HashMap<String, Integer>
		// -----------------------------------------------
		System.out.println("\n--- New HashMap<String, Integer> Examples ---");

		HashMap<String, Integer> fruitCount = new HashMap<>();
		fruitCount.put("Apple", 5);
		fruitCount.put("Banana", 10);

		System.out.println("Original fruitCount Map: " + fruitCount);

		// -----------------------------------------------
		// Simple getOrDefault() Example   ----> Basically it returns the count or rather the value of a particular key
		// -----------------------------------------------
		System.out.println("\nSimple getOrDefault() Example:");
		int count1 = fruitCount.getOrDefault("Apple", 0);   // Key exists
		int count2 = fruitCount.getOrDefault("Mango", 0);   // Key does not exist
		System.out.println("Count for 'Apple': " + count1);
		System.out.println("Count for 'Mango' (default): " + count2);
		System.out.println(fruitCount);
		// -----------------------------------------------
		// getOrDefault() used for Counting
		// -----------------------------------------------
		System.out.println("\nUsing getOrDefault() for Counting:");
		System.out.println("BEFORE :" +fruitCount);
		fruitCount.put("Apple", fruitCount.getOrDefault("Apple", 0) + 1); // Existing key → 5+1=6
		fruitCount.put("Mango", fruitCount.getOrDefault("Mango", 0) + 1); // New key → 0+1=1
		System.out.println("After counting update: " + fruitCount);

		// -----------------------------------------------
		// putIfAbsent() Example
		// -----------------------------------------------
		System.out.println("\nputIfAbsent() Example:");
		fruitCount.putIfAbsent("Banana", 20); // Banana already exists → No change
		fruitCount.putIfAbsent("Orange", 15); // Orange does not exist → Added
		System.out.println("After putIfAbsent update: " + fruitCount);

		// -----------------------------------------------
		// Small List contains example
		// -----------------------------------------------
		System.out.println("\n--- List contains() Example ---");
		List<Integer> list = Arrays.asList(2, 4, 32, 43, 4, 432);
		boolean isPresent = list.contains(32);
		System.out.println("Does list contain 32?: " + isPresent);
	}
}
