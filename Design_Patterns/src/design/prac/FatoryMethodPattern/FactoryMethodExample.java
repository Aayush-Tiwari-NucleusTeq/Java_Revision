package design.prac.FatoryMethodPattern;

public class FactoryMethodExample {

	public static void main(String[] args) {
		System.out.println("Start of the program");
//		Employee emp = new AndroidDeveloper();
//		System.out.println(emp.salary());
//		Employee emp2 = new WebDeveloper();
//		System.out.println(emp2.salary());
		
		Employee emp1 = EmployeeFactory.getEmployee("android developer");
		System.out.println(emp1.salary());
		Employee emp2 = EmployeeFactory.getEmployee("web developer");
		System.out.println(emp2.salary());

	}

}
