package goodImplementation;

import java.util.Scanner;

public class CarAndBikeRetailShop {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to Max Retailers");
		int choice;
		String buy ="";
		do {
			System.out.println("1->Car\n2->Bike\n3->Exit");
			choice = scan.nextInt();
			int internalchoice;
			switch(choice) {
			case 1:
				System.out.println("Available Car Company\n1->Tata\n2->Kia");
				internalchoice = scan.nextInt();
				switch(internalchoice) {
				case 1:Vehicle tata = new Car("Tata");
				System.out.println("Mileage :"+tata.getMileage());
				System.out.println("Maximum Speed :"+tata.getSpeed());
				System.out.println("Maximum Person accommodate :"+tata.spaceAvailable());
				System.out.println("Willing to buy(Yes/No):");
				buy = scan.next();
				if(buy.toLowerCase().equals("yes")) {
					choice=3;
				}
				break;
				case 2:Vehicle kia = new Car("Kia");
				System.out.println("Mileage :"+kia.getMileage());
				System.out.println("Maximum Speed :"+kia.getSpeed());
				System.out.println("Maximum Person accommodate :"+kia.spaceAvailable());
				System.out.println("Willing to buy(Yes/No):");
				buy = scan.next();
				if(buy.toLowerCase().equals("yes")) {
					choice=3;
				}
				break;
				default:System.out.println("No other Brands Available.Sorry!");
				}
				break;
			case 2:System.out.println("Available Car Company\n1->Hero\n2->KTM");
				internalchoice = scan.nextInt();
				switch(internalchoice) {
				case 1:Vehicle hero = new Bike("Hero");
				System.out.println("Mileage :"+hero.getMileage());
				System.out.println("Maximum Speed :"+hero.getSpeed());
				System.out.println("Willing to buy(Yes/No):");
				buy = scan.next();
				if(buy.toLowerCase().equals("yes")) {
					choice=3;
				}
				break;
				case 2:Vehicle ktm = new Bike("Ktm");
				System.out.println("Mileage :"+ktm.getMileage());
				System.out.println("Maximum Speed :"+ktm.getSpeed());
				System.out.println("Willing to buy(Yes/No):");
				buy = scan.next();
				if(buy.toLowerCase().equals("yes")) {
					choice=3;
				}
				break;
				default:System.out.println("No other Brands Available.Sorry!");
				}
				break;
			default:System.out.println("No other Company available");
			}
		}while(choice!=3);
		if(buy.toLowerCase().equals("yes")) {
			System.out.println("Thanks for Choosing us! Have a Smooth Ride.");
		}
		else
			System.out.println("Hope to meet you soon.");
	}

}
