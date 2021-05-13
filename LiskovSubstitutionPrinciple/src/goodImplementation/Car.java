package goodImplementation;

public class Car extends Vehicle{
	private String companyName;

	public Car(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public int getSpeed() {
		if(getCompanyName().equals("Tata"))
			return 180;
		else if(getCompanyName().equals("Kia"))
				return 150;
		else
			return 100;
	}
	
	public int getMileage() {
		if(getCompanyName().equals("Tata"))
			return 30;
		else if(getCompanyName().equals("Kia"))
				return 20;
		else
			return 10;
	}
	public int spaceAvailable() {
		if(getCompanyName().equals("Kia"))
			return 8;
		else
			return 5;	
	}

}
