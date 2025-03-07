package design.prac.AbstractFactoryPattern;

public class AndroidDeveloper implements Employee{

	@Override
	public int salary() {
		return 50000;
	}

	@Override
	public String name() {
		System.out.println("Under Android Developer class");
		return "Android Developer class";
	}

}
