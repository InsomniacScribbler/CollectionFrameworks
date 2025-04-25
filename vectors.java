import java.sql.SQLOutput;
import java.util.Vector;

public class vectors {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>(5,2);
		v1.add(1);
		v1.add(2);
		System.out.println(v1.capacity());
		v1.add(3);
		v1.add(5);
		System.out.println(v1.capacity());
		v1.add(6);
		v1.add(7);
		System.out.println(v1.capacity());
		v1.add(18);
		v1.add(19);
		System.out.println(v1.capacity());
		System.out.println(v1);
		v1.clear();
		System.out.println(v1);
	}
}
