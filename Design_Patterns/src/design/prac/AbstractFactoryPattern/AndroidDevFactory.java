package design.prac.AbstractFactoryPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new AndroidDeveloper();
	}

}
