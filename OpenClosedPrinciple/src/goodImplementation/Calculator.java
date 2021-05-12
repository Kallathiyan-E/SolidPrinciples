package goodImplementation;

import java.util.Scanner;

public class Calculator {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter How much Values needed to calculate :");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter Numbers :");
		for(int i=0;i<size;i++) {
			numbers[i]=scan.nextInt();
		}
		MultipleNumbersCalculator calculator = new MultipleNumbersCalculator();
		int choice=0;
		do {
			System.out.print("1->Add\n2->subtract\n3->Mulitply\n4->Divide\n5->Exit");
			choice = scan.nextInt();
			switch(choice) {
			case 1:System.out.println("Result ="+calculator.add(numbers));
					break;
			case 2:System.out.println("Result ="+calculator.subtract(numbers));
					break;
			case 3:System.out.println("Result ="+calculator.multiply(numbers));
					break;
			case 4:System.out.println("Result ="+calculator.divide(numbers));
					break;
			case 5:System.out.println("Thank You");
					break;
			default:System.out.println("Enter a Valid Choice");
			}
		}while(choice!=5);
	
	}
}
