import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayLists {
	public static void main(String[] args) {
		ArrayList <Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(80);
		System.out.println(list1);
		list1.add(2,50);
		System.out.println(list1);
		list1.set(2,30);
		int[] arr = {1,2,4,5};
		List<int[]> arr1 = Arrays.asList(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(list1.contains(10));
	}
}
