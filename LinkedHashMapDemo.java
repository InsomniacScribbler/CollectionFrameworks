import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> m1 = new LinkedHashMap<>(11,0.3f,true);
		LinkedHashMap<Integer,String> m2 = new LinkedHashMap<>(11,0.3f,false);
		m1.put(56, "joshi");
		m1.put(1, "Sujit");
		m1.put(2, "Nikhil");
		System.out.println(m1);
		System.out.println("Access Order True");
		m1.get(1);
		System.out.println(m1);
		System.out.println();

		m2.put(56, "joshi");
		m2.put(1, "Sujit");
		m2.put(2, "Nikhil");
		System.out.println(m2);
		System.out.println("Access Order flase");
		m2.get(12);
		System.out.println(m2);
	}
}
