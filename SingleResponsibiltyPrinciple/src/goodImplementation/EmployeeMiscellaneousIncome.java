package goodImplementation;

public class EmployeeMiscellaneousIncome extends EmployeeDetails{


	public EmployeeMiscellaneousIncome(String name, int id, int salary) {
		super(name, id, salary);
		
	}

	public double calculateHike() {
		return salary *0.02;
	}
	
	public double calculateBonus() {
		return salary *0.05; 
	}

}
