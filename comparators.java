import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// this implementing Comparator interface
//class StringLengthComprator implements Comparator<String>{
//	@Override
//	public int compare(String s1, String s2){
//		return s1.length() - s2.length();
//	}
//}

class integerComparator implements  Comparator<Integer>{
	@Override
	public int compare(Integer i1, Integer i2){
		return i2 - i1 ; //this is for descending for ascending i1-i2
	}
}

public class comparators {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(2);
		l1.add(1);
		l1.add(3);

		l1.sort(null);
		System.out.println(l1);
		l1.sort(new integerComparator());
		System.out.println(l1);

		List <String> l2 = Arrays.asList("Banana","apple","date");

		l2.sort(null);
		System.out.println(l2);

// this is just using lambda expression to implement custom sorting
		l2.sort((a,b) -> a.length() -  b.length());
		System.out.println(l2);


	}
}
