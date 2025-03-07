package design.prac;

public class Samosa {
	
	static Samosa samosa;
	private Samosa() {
//		System.out.println("Samosa constructor");
	}
	
	// Lazy way of creating a singleton object
	public static Samosa getSamosa() {
		if(samosa == null) {
			samosa = new Samosa();
		}
		return samosa;
	}
}
