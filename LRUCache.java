import java.util.LinkedHashMap;
import java.util.Map;

// Create a class LRUCache that extends LinkedHashMap
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
	private int capacity; // maximum number of entries the cache can hold

	// Constructor to initialize the cache
	public LRUCache(int capacity) {
		// super(capacity, loadFactor, accessOrder)
		// loadFactor 0.3f (not so important for now)
		// accessOrder = true --> means ordering based on "access" not "insertion"
		super(capacity, 0.3f, true);
		this.capacity = capacity;
	}

	// This method is automatically called by LinkedHashMap
	// After every put or putIfAbsent, it checks if we need to remove the oldest entry
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		// if size > capacity, return true --> remove eldest
		// otherwise, keep the entry
		return size() > capacity;
	}

	// Main method to test our LRUCache
	public static void main(String[] args) {
		// Create an LRUCache of capacity 3
		LRUCache<String, Integer> studentMap = new LRUCache<>(3);

		// Add some entries
		studentMap.put("Bob", 1);     // Bob is inserted
		studentMap.put("Alice", 2);   // Alice is inserted
		studentMap.put("Braun", 4);   // Braun is inserted
		System.out.println(studentMap);
		// Now cache is full (Bob, Alice, Braun)

		studentMap.put("Bruno", 3);   // This insert will cause eldest (Bob) to be removed

		// Since capacity is only 3, and size becomes 4 after inserting Bruno
		// So LinkedHashMap internally calls removeEldestEntry()
		// removeEldestEntry() returns true because size > capacity
		// Hence, Bob is evicted from the map

		System.out.println(studentMap);
		// Expected Output:
		// {Alice=2, Braun=4, Bruno=3}
	}
}
