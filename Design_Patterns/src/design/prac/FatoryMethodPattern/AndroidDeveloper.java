package design.prac.FatoryMethodPattern;

public class AndroidDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("Android Developer salary printing"); 
		return 10000;
	}

}
