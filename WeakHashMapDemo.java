import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) {
		WeakHashMap <String, Image> imageCache = new WeakHashMap<>();


		imageCache.put(new String("img1"), new Image("Image 1"));
		imageCache.put(new String("img2"), new Image("Image 2"));

		System.out.println(imageCache);

		System.gc();

		simulatedAppRunning();
		System.out.println(imageCache);
	}
	public static void simulatedAppRunning() {
		try{
			Thread.sleep(10000);
		}
		catch (InterruptedException e){}
	}
}



class Image{
	private String name;

	@Override
	public String toString() {
		return
				 name
				;
	}

	public Image(String name) {
		this.name = name;
	}
}