package badImplementation;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		int choice;
		int length;
		int breadth ;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Calculate Area:\n1->Rectangle\n2->Square\n3->Exit");
			System.out.print("Your Choice:");
			choice = scan.nextInt();
			switch(choice) {
			case 1:System.out.print("Length:");
				length = scan.nextInt();
				System.out.print("Breadth:");
				breadth = scan.nextInt();
				Shape rectangle = new Rectangle(length,breadth);
				System.out.println("Area = "+rectangle.area());
				break;
			case 2:System.out.print("Length:");
				length = scan.nextInt();
				Shape square = new Square(length,0);
				System.out.println("Area = "+square.area());
				break;
			case 3:System.out.println("Thank you!");
				break;
			default:System.out.println("Please!Enter Valid Option!");
			scan.close();
			}
		}while(choice!=3);
		
		
	}
	
}
