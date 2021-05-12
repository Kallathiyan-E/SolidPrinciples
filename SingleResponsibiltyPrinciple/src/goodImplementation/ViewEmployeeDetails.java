package goodImplementation;

public class ViewEmployeeDetails extends EmployeeDetails{




	public ViewEmployeeDetails(String name, int id, int salary) {
		super(name, id, salary);
		
	}

	public void printDetails() {
		System.out.println("Employee Details\nEmployee Name :"+super.getName()+"\nEmplyee Id "
				+ ":"+super.getId()+"\nEmployee Salary"+super.getSalary());
	}
}
