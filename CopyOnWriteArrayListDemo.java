import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {

		/*
		 * ---------------------------------------------
		 * ✅ What is CopyOnWriteArrayList?
		 * ---------------------------------------------
		 * - It is a thread-safe variant of ArrayList.
		 * - Belongs to java.util.concurrent package.
		 * - Suitable for situations where reads are frequent and writes (add/remove) are rare.
		 * - Ideal for multi-threaded programs where you want to avoid ConcurrentModificationException.
		 *
		 * 🔁 How it works internally:
		 * - Every time you perform a write operation (add, remove, etc.),
		 *   it creates a fresh copy of the entire underlying array.
		 * - This ensures that any thread currently iterating over the list
		 *   is working on a snapshot and is not affected by changes.
		 */

		// ✅ Creating a CopyOnWriteArrayList of Strings
		List<String> shoppingList = new CopyOnWriteArrayList<>();

		// ✅ Adding elements to the list (write operation)
		shoppingList.add("Milk");
		shoppingList.add("Eggs");
		shoppingList.add("Bread");

		// ✅ Print the initial list
		System.out.println("Initial Shopping List: " + shoppingList);

		/*
		 * ---------------------------------------------
		 * ✅ Iteration and Modification Example
		 * ---------------------------------------------
		 * - Normal ArrayList will throw ConcurrentModificationException
		 *   if modified while iterating using for-each loop.
		 * - But CopyOnWriteArrayList allows it safely.
		 * - However, changes made during iteration are NOT reflected
		 *   in the ongoing iteration. They appear only in the next iteration.
		 */

		for (String item : shoppingList) {
			System.out.println("Reading item: " + item);

			// ✅ Modifying the list during iteration
			if (item.equals("Eggs")) {
				shoppingList.add("Butter");  // Safe to add during iteration
				System.out.println("Added Butter while reading.");
			}
		}

		// ✅ Final state of the list after modification
		System.out.println("Updated Shopping List: " + shoppingList);

		/*
		 * ---------------------------------------------
		 * 🧠 Summary for Revision:
		 * ---------------------------------------------
		 * - Thread-safe alternative to ArrayList.
		 * - No ConcurrentModificationException.
		 * - Suitable for read-heavy, write-light use cases.
		 * - Write operations are expensive due to array copying.
		 * - Iterator works on a snapshot; new elements are not seen during current iteration.
		 */
	}
}
