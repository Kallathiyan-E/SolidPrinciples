package goodImplementation;

public class Bike extends Vehicle{
	private String companyName;

	public Bike(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public int getSpeed() {
		if(getCompanyName().equals("Hero"))
			return 180;
		else if(getCompanyName().equals("Ktm"))
				return 250;
		else
			return 100;
	}
	
	public int getMileage() {
		if(getCompanyName().equals("Hero"))
			return 50;
		else if(getCompanyName().equals("Ktm"))
				return 20;
		else
			return 35;
	}
	public int spaceAvailable() {
		return 2;	
	}


}
