package design.prac.AbstractFactoryPattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		return 40000;
	}

	@Override
	public String name() {
		System.out.println("Under Web Developer class");
		return "Web Developer class";
	}

}
