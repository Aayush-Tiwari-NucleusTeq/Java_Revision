package design.prac.AbstractFactoryPattern;

public class EmployeeFactory {

	public static Employee getEmployee(EmployeeAbstractFactory employee) {
		return employee.createEmployee();
	}
}
