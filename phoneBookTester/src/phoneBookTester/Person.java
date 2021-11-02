package phoneBookTester;

public class Person {

	public static Object getAddress;
	private String firstName;
	private String middleName;
	private String lastName;

	private String phoneNumber;
	public Address myAddress;


	public Person() {

	}

	public Person(String firstName, String middleName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public void addAddress(String street, String city, String state, String zip) {
		Address tempAddress = new Address(street, city, state, zip);
		this.myAddress = tempAddress;
	}

	public Address getAddress() {
		return myAddress;
	}

	public void printPerson() {
		System.out.println("Name: " + " " + firstName + " " + middleName + " " + lastName + " " + phoneNumber);
		myAddress.printAddress();
		System.out.println("-----------------------------------------");
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void printPersonInfo() {
		System.out.println(firstName + lastName + phoneNumber);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "\nPerson: " + firstName + " " + middleName + " " + lastName + " " + phoneNumber + " " + myAddress;
	}


}