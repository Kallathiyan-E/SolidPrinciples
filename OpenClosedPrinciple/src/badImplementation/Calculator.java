package badImplementation;

import java.util.Scanner;

public class Calculator{

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int one = 0;
		int two = 0;
		try{
			System.out.print("First Value:");
			one = scan.nextInt();
			System.out.print("Second Value");
			two = scan.nextInt();
		}
		catch(Exception e) {
			System.err.println("Enter Only Numbers!");
		}
		BaseOperation calculator = new BaseOperation(one,two);
		int choice=0;
		do {
			System.out.print("1->Add\n2->subtract\n3->Mulitply4->Divide\n5->Exit");
			choice = scan.nextInt();
			switch(choice) {
			case 1:System.out.println("Result ="+calculator.add());
					break;
			case 2:System.out.println("Result ="+calculator.subtraction());
					break;
			case 3:System.out.println("Result ="+calculator.multiply());
					break;
			case 4:System.out.println("Result ="+calculator.divide());
					break;
			case 5:System.out.println("Thank You");
					break;
			default:System.out.println("Enter a Valid Choice");
			}
		}while(choice!=5);
		
	}
	
}
