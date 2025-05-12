import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer,String> map = new TreeMap<>();
		map.put(56, "joshi");
		map.put(1, "Sujit");
		map.put(2, "Nikhil");
		System.out.println(map);
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap(2));
		System.out.println(map.tailMap(2));
		System.out.println();
		SortedMap<Integer,String> map1 = new TreeMap<>((a,b) -> b-a);
		map1.put(56, "joshi");
		map1.put(1, "Sujit");
		map1.put(2, "Nikhil");
		System.out.println(map1);
		System.out.println(map1.firstKey());
		System.out.println(map1.lastKey());
		System.out.println(map1.headMap(2));
		System.out.println(map1.tailMap(2));


		NavigableMap<Integer, String> navigableMap = new TreeMap<>();
		map1.put(56, "joshi");
		map1.put(1, "Sujit");
		map1.put(2, "Nikhil");
		System.out.println(map1);
		System.out.println(map1.firstKey());
		System.out.println(map1.lastKey());
		System.out.println(map1.headMap(2));
		System.out.println(map1.tailMap(2));
	}


}
