package work;

public class Main {

	public static void main(String[] args) {
		System.out.println("Different ways of implementing Functional Interface");
		
		// I way(Implemented another class)
		System.out.println("\n\nI - Using implemented in another class");
		MyInterImpl obj1 = new MyInterImpl();
		obj1.sayHello();
		
		// II way(Anonymous class)
		System.out.println("\n\nII - Using anonymous class");
		MyInter obj2 = new MyInter() {
			
			@Override
			public void sayHello() {
				System.out.println("Functional Interface with anonymous class part I");	
			}
		};
		
		obj2.sayHello();
		
		MyInter obj3 = new MyInter() {
			
			@Override
			public void sayHello() {
				System.out.println("Functional Interface with anonymous class part II");	
			}
		};
		
		obj3.sayHello();
		
		// II way(Lambda Function)
		System.out.println("\n\nII - Using lambda function");
		System.out.println("\n\nLambda expression with parameters");
		System.out.println(" Zero parameter");
		MyInter obj4 = () -> System.out.println("Functional Interface with lambda expression part I");
		obj4.sayHello();
		MyInter obj5 = () -> System.out.println("Functional Interface with lambda expression part II");
		obj5.sayHello();
		
		System.out.println("\n Single parameter");
		LenInter obj6 = (str) -> str.length();
		System.out.println("Length of the text Aayush is " + obj6.getLength("Aayush"));
		
		System.out.println("\n Multiple parameters");
//		SumInter obj7 = (int a, int b) -> {return (a + b);};
		SumInter obj8 = (a, b) -> a * b;
		System.out.println("The answer is " + obj8.sum(100, 50));
	}	

}
