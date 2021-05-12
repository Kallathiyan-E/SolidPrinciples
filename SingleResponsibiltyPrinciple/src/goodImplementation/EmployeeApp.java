package goodImplementation;


public class EmployeeApp {

	
	public static void main(String[] args) {
		
		ViewEmployeeDetails trainee = new ViewEmployeeDetails("Haides",101,20000);
		trainee.printDetails();
		EmployeeMiscellaneousIncome  income = new EmployeeMiscellaneousIncome("Haides",101,20000);
		System.out.println("Bonus:"+income.calculateBonus());
		System.out.println("Hike:"+income.calculateHike());
		EmployeeDetails intern = new EmployeeDetails("Haides",101,20000);
		intern.setName("Small Boy");
		intern.setSalary(10000);
		System.out.println("Name :"+intern.getName()+"\nId :"+intern.getId()+""
				+ "nSalary :"+intern.getSalary());
	}
	
}
