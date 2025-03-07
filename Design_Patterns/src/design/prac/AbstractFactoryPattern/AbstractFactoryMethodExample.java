package design.prac.AbstractFactoryPattern;

public class AbstractFactoryMethodExample {

	public static void main(String[] args) {
		System.out.println("Start of the program");
		Employee emp1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
		emp1.name();
		Employee emp2 = EmployeeFactory.getEmployee(new WebDevFactory());
		emp2.name();
		
	}

}
