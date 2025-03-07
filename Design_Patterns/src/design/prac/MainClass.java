package design.prac;

public class MainClass {

	public static void main(String[] args) {
//		System.out.println(new Samosa().hashCode());
		
		Samosa samosa1 = Samosa.getSamosa();
		Samosa samosa2 = Samosa.getSamosa();
		System.out.println(samosa1.hashCode());
		System.out.println(samosa2.hashCode());
		
	}

}
