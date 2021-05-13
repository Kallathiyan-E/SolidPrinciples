package badImplementation;

import java.util.Scanner;

public class DriverClass {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Company corporate = new Company();
		int choice;
		do {
			System.out.println("1->Add Employee\n2->Remove Employee\n"
					+ "3->View Employees\n4->Exit");
			System.out.print("Your Choice :");
			choice = scan.nextInt();
			switch(choice) {
			case 1:System.out.print("Employee Details\nName :");
				String name = scan.next();
				System.out.print("Age :");
				int age = scan.nextInt();
				System.out.print("Address :");
				String address = scan.next();
				Person human = new Person(name,age,address);
				System.out.print("Email :");
				String email  = scan.next();
				System.out.print("Phone Number :");
				int phoneNumber = scan.nextInt(); 
				Employee newEmployee = new Employee(human,email,phoneNumber);
				corporate.addEmployee(newEmployee);
				break;
			case 2:System.out.println("Employee Name :");
				String exEmployee = scan.next();
				corporate.removeEmployee(exEmployee);
				break;
			case 3:corporate.viewEmployee();
				break;
			case 4:System.out.println("Thnak You");
				break;
			
			default:System.out.println("Please!Enter Valid Option.");
			}
		}while(choice!=0);
	}
	
}
