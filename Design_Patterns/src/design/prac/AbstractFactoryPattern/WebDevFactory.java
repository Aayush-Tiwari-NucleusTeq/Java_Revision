package design.prac.AbstractFactoryPattern;

public class WebDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new WebDeveloper();
	}

}
