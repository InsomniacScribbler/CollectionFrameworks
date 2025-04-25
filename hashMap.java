import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> m1 = new HashMap<>();
		m1.put(56, "joshi");
		m1.put(1, "Sujit");
		m1.put(2, "Nikhil");
		System.out.println(m1);

		System.out.println();
		System.out.println(m1.get(2));

		System.out.println(m1.containsKey(3));
		System.out.println();
		for (int key : m1.keySet()){
			System.out.println(m1.get(key));
		}
		System.out.println();
		for(Map.Entry<Integer,String> entry: m1.entrySet()){
			System.out.println(entry.getValue().toUpperCase());
		}
   	}
}
