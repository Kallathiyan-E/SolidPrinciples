package badImplementation;

public class Company {

	public static void main(String[] args) {
		Employee trainee = new Employee("Zeus",100,1000000);
		System.out.println("Employee Bonus:"+trainee.calculateBonus());
		System.out.println("Employee Hike:"+trainee.calculateHike());
		trainee.updateSalary(10000);
		trainee.printDetails();
	}

}
