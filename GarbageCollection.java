import java.lang.ref.WeakReference;

public class GarbageCollection {
	static class Phone{
		String brand;
		int cost;

		public Phone(String brand, int cost) {
			this.brand = brand;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Phone{" +
					"brand='" + brand + '\'' +
					", cost=" + cost +
					'}';
		}
	}

	public static void main(String[] args) {
		Phone phn = new Phone("iphone",  150000);
		WeakReference<Phone> phone = new WeakReference<>(new Phone("Pixel", 75000));
		System.out.println("before the thread sleeps");
		System.out.println("WeaK REFERENCE"+phone.get());
		System.out.println("Strong refrence"+phn);
		try{
			Thread.sleep( 100000);
		}
		catch(Exception ignored){}
		System.gc();
		System.out.println("After thread sleeps for 100 sec");
		System.out.println("WeaK REFERENCE"+phone.get());
		System.out.println("Strong refrence"+phn);
		phn = null;
		System.out.println("After phn = null:"+phn);
	}
}
