package design.prac.SingletonPattern;

public class SingletonClassExample {

	public static void main(String[] args) {
//		System.out.println(new Samosa().hashCode());
		
		Samosa samosa1 = Samosa.getSamosa();
		Samosa samosa2 = Samosa.getSamosa();
		System.out.println(samosa1.hashCode());
		System.out.println(samosa2.hashCode());
		
		// Can break the singleton pattern with two ways 
		// a) Reflection API [Solution for this is to use either enum or throw an exception in constructor when object is already present]
		// b) Deserialization [Solution for this is to implement readResolve()]
		// c) Cloning
		
	}

}
