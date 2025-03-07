package design.prac.FatoryMethodPattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("Web Developer salary printing");
		return 80000;
	}

}
