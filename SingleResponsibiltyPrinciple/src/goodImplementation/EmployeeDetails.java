package goodImplementation;

public class EmployeeDetails {
	protected String name;
	protected int id;
	protected int salary;
	


	public EmployeeDetails(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


}
