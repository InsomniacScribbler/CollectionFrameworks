import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Vector;

public class vectors {
	public static void main(String[] args) {

//		v1.add(1);
//		v1.add(2);
//		System.out.println(v1.capacity());
//		v1.add(3);
//		v1.add(5);
//		System.out.println(v1.capacity());
//		v1.add(6);
//		v1.add(7);
//		System.out.println(v1.capacity());
//		v1.add(18);
//		v1.add(19);
//		System.out.println(v1.capacity());
//		System.out.println(v1);
//		v1.clear();
//		System.out.println(v1);
		ArrayList<Integer> al1 = new ArrayList<>();
		Thread t1 = new Thread(() -> {for(int i = 0 ; i<1000; i++){
			al1.add(i);
		}
		} );
		Thread t2 = new Thread(() -> {for(int i = 1000 ; i<2000; i++){
			al1.add(i);
		}
		} );
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(al1.size());


		Vector<Integer> v1 = new Vector<>(5,2);
		Thread t3 = new Thread(() -> {for(int i = 0 ; i<1000; i++){
			v1.add(i);
		}
		} );
		Thread t4 = new Thread(() -> {for(int i = 1000 ; i<2000; i++){
			v1.add(i);
		}
		} );
		t3.start();
		t4.start();

		try {
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(v1.size());


	}
}
