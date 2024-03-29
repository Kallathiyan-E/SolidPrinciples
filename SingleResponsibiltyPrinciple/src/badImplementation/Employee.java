package badImplementation;

public class Employee {
	private String name;
	private int id;
	private int salary;
	
	public Employee(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void updateSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void updateName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void updateId(int id) {
		this.id = id;
	}
	
	public double calculateHike() {
		return this.salary *0.02;
	}
	
	public double calculateBonus() {
		return this.salary *0.05; 
	}
	
	public void printDetails() {
		System.out.print("Employee Details\nEmployee Name :"+this.name+"\nEmplyee Id :"+this.id
				+"\nEmployee Salary"+this.salary);
	}
}
