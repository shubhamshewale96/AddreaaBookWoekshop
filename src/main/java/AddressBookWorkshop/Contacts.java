package AddressBookWorkshop;

public class Contacts {
	public String fName;
	public String lName;
	public String add;
	public String city;
	public String state;
	public int zipCode;
	public String email;
	public int mobileNumber;

	public Contacts(String fName, String lName, String add, String city, String state, int zipCode, String email,
			int mobileNumber) {
		this.fName = fName;
		this.lName = lName;
		this.add = add;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Contact [fName=" + fName + ", lName=" + lName + ", add=" + add + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", email=" + email + ", mobileNumber=" + mobileNumber + "]";
	}

}
