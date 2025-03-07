package design.prac.SingletonPattern;

public class Jalebi {
	
	// Eager way of creating a singleton object
	private static Jalebi jalebi = new Jalebi();
	
	public static Jalebi getJalebi() {
		return jalebi;
	}
}
