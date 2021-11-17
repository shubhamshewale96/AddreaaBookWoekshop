package AddressBookWorkshop;

import java.util.*;
import java.io.*;

public class AddressBookMain {
	public static void welcome() {
		System.out.println("Welcome to AddressBook");
	}

	private List<Contacts> contactList;

	public AddressBookMain(List<Contacts> contactList) {
		this.contactList = contactList;
	}

	public static void main(String[] args) {
		welcome();
		ArrayList<Contacts> contactList = new ArrayList<>();
		AddressBookMain addressBookMain = new AddressBookMain(contactList);
		Scanner consoleInputReader = new Scanner(System.in);
		addressBookMain.readContactList(consoleInputReader);
		addressBookMain.writeContactList();
	}

	private void readContactList(Scanner consolInputReader) {
		System.out.println("Enter First Name: ");
		String fName = consolInputReader.next();
		System.out.println("Enter Last Name: ");
		String lName = consolInputReader.next();
		System.out.println("Enter Add : ");
		String add = consolInputReader.next();
		System.out.println("Enter city: ");
		String city = consolInputReader.next();
		System.out.println("Enter state ");
		String state = consolInputReader.next();
		System.out.println("Enter Zipcode:  ");
		int zipCode = consolInputReader.nextInt();
		System.out.println("Enter Email Id ");
		String email = consolInputReader.next();
		System.out.println("Enter Mobile number  ");
		int mobileNumber = consolInputReader.nextInt();
		contactList.add(new Contacts(fName, lName, add, city, state, zipCode, email, mobileNumber));
	}

	private void writeContactList() {
		System.out.println("\n write contact data \n " + contactList);
	}
}
