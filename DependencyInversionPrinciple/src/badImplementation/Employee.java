package badImplementation;

public class Employee {
	private Person details;
	private String 	email;
	private int phoneNumber;
	
	public Employee(Person details, String email, int phoneNumber) {
		this.details = details;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public Person getDetails() {
		return details;
	}

	public void setName(Person details) {
		this.details = details;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
