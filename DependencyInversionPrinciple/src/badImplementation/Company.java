package badImplementation;

import java.util.ArrayList;

public class Company {
	ArrayList<Employee> smallCompany = new ArrayList<Employee>();
	
	public void addEmployee(Employee worker) {
		smallCompany.add(worker);
	}
	public void removeEmployee(String name) {
		for(Employee i:smallCompany) {
			if(i.getDetails().getName().equals(name)){
				smallCompany.remove(i);
				System.out.println("Employee Resigned Successfully");
				break;
			}
		}
	}
	
	public void viewEmployee() {
		for(Employee worker:smallCompany) {
			System.out.println("Name :"+worker.getDetails().getName()+"\nPhone Number :"
		+worker.getPhoneNumber()+"\nEmail :"+worker.getEmail());
		}
	}
}
