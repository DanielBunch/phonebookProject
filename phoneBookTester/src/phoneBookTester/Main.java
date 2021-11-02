package phoneBookTester;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Functions directory = new Functions();
		Person p1 = new Person("John", "", "Doe", "6366435698");
		p1.addAddress("114 Market St", "St Louis", "Mo", "63403");
		Person p2 = new Person("John", "E", "Doe", "8475390126");
		p2.addAddress("324 main st", "st charles", "MO", "63303");
		Person p3 = new Person("John", "Michael West", "Doe", "5628592375");
		p3.addAddress("574 pole ave", "st peters", "MO", "63333");
		Person p4 = new Person ("Peter", "", "Griffin", "5552131234");
		p4.addAddress("31 Spooner St", "Quahog", "RI","98756");
		Person p5 = new Person("Bart","JoJo", "Simpson","5556969585");
		p5.addAddress("742 Evergreen Terrace", "Springfield", "IL", "58795");
		Person p6 = new Person("Jeff", "", "Boomhauer", "9265557894");
		p6.addAddress("73 Rainey Street", "Abilene", "TX", "79855");
		directory.addPerson(p1);
		directory.addPerson(p2);
		directory.addPerson(p3);
		directory.addPerson(p4);
		directory.addPerson(p5);
		directory.addPerson(p6);

		
		
		
		
		int choice = 0;
		while(choice !=8) {
		choice = displayMenu();
		switch (choice) {

		case 1:
			System.out.println("Please enter first name: ");
			String firstName = sc.nextLine().toLowerCase();
			directory.searchFName(firstName);
			break;

		case 2:
			System.out.println("Please enter last name: ");
			String lastName = sc.nextLine().toLowerCase();
			directory.searchLName(lastName);
			break;

		case 3:
			System.out.println("Please enter first name: ");
			firstName = sc.nextLine().toLowerCase();
			System.out.println("Please enter last name:");
			lastName = sc.nextLine().toLowerCase();
			directory.searchFirstLast(firstName, lastName);

			break;

		case 4:
			System.out.println("Please enter phone number (1112223456): ");
			String phoneNumber = sc.nextLine();
			directory.searchPhoneNumber(phoneNumber);

			break;

		case 5:
			// Search by city/state
			System.out.println("Please enter city: ");
			String city = sc.nextLine().toLowerCase();
			System.out.println("Please enter abbreviated state (XX): ");
			String state = sc.nextLine().toLowerCase();
			directory.searchCityState(city, state);

			break;

		case 6:
			// Delete Contact
			Person deleteContact = new Person();
			System.out.println("Please enter phone number of person to delete (1112223456): ");
			String deletePhone = sc.nextLine();
			directory.deletePerson(deletePhone);
			System.out.println("Contact Deleted");

			break;

		case 7:
			// Show All Contacts
			System.out.println("The phonebook contacts are: ");
			directory.ascendingOrder();
			directory.printPhonebook();
			break;
			
		case 8:
			System.out.println("Thank you!");
			break;
		default:
			System.out.println("Please enter a number 1 through 8!!!");
			break;

		}
	}
	}

	public static int displayMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("**Phonebook App**");
		System.out.println("What would you like to do? ");
		System.out.println("1: Search Contact by first name ");
		System.out.println("2: Search Contact by last name");
		System.out.println("3: Search Contact by full name ");
		System.out.println("4: Search Contact by phone number");
		System.out.println("5: Search by city and state");
		System.out.println("6: Delete Contact");
		System.out.println("7: Show All contacts");
		System.out.println("8: Exit Program");
		int choice = sc.nextInt();
		return choice;

	}

}
