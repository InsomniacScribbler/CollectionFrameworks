import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		String key1 = new String("key");
		String key2 = new String("key");
		Map<String, Integer> map = new HashMap<>();
		map.put(key1, 1); //key, 1
		map.put(key2,2); //key, 2
		System.out.println(key1.equals(key2)); //here both the objects are not different cuz for string the
		// hashcode is created by creating the hashcode from the String itself unlike other objects, hence both the
		// objects turn out to be same, so it replaces, if collision was encountered(i.e. the .equals method gave false
		// then only the Linked List would've have been created
		System.out.println(map);
		System.out.println(key1 == key2);
		Map<String, Integer> map1 = new IdentityHashMap<>();// identity hashmap takes into consideration the memory address for hashcode calculation
		// it uses ==  instead of .equals()
		map1.put(key1, 1); //key, 1
		map1.put(key2,2); //key, 2
		System.out.println(map1);
	}
}
