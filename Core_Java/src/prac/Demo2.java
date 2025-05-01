package prac;

class Studentt{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Studentt() {
	}
	public Studentt(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

interface I1{
	public default void method1() {
		System.out.println("Under I1");
	};
}
interface I2 extends I1{
	public default void method1() {
		System.out.println("Under I2");
	};
}
interface I3 extends I1{
	public default void method1() {
		System.out.println("Under I3");
	};
}

//class C implements I2, I3{	
//}

public class Demo2 {
	public static void main(String[] args) {
//		System.out.println("Demo2 class");
//		A a = new A();
//		a.method();
		
//		C c = new C();
//		c.method1();
		
	}
}
