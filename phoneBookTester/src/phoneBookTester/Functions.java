package phoneBookTester;

public class Functions {
	Person[] phonebook = new Person[0];

	public void addPerson(Person newPerson) {
		Person[] temp = new Person[phonebook.length + 1];

		for (int i = 0; i < phonebook.length; i++) {
			temp[i] = phonebook[i];
		}
		temp[temp.length - 1] = newPerson;

		phonebook = temp;
	}

	public Person[] getContact() {
		return phonebook;
	}

	public void printContact() {
		for (int i = 0; i < phonebook.length; i++) {
			phonebook[i].printPerson();
		}
	}

	public void deletePerson(String deletePhone) {
		Person[] temp = new Person[phonebook.length - 1];
		int count = 0;

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i].getPhoneNumber().equals(deletePhone)) {
				continue;
			}
			temp[count++] = phonebook[i];
		}
		phonebook = temp;

	}

	// First Switch Choice Search First Name
	public void searchFName(String firstName) {
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i].getFirstName().toLowerCase().equals(firstName.toLowerCase())) {
				phonebook[i].printPerson();
			}
		}
	}

	// Second Switch Choice Last Name
	public void searchLName(String lastName) {
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i].getLastName().toLowerCase().equals(lastName.toLowerCase())) {
				phonebook[i].printPerson();
			}

		}

	}

	// Third Switch Choice First Last
	public void searchFirstLast(String firstName, String LastName) {

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i].getFirstName().toLowerCase().equals(firstName.toLowerCase())
					&& (phonebook[i].getLastName().toLowerCase().equals(LastName.toLowerCase()))) {
				phonebook[i].printPerson();
			}

		}

	}

	// Fourth Switch Choice Phone Search
	public void searchPhoneNumber(String phoneNumber) {
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i].getPhoneNumber().equals(phoneNumber)) {
				phonebook[i].printPerson();
			}
		}

	}

	public void searchCityState(String city, String state) {
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i].myAddress.getCity().toLowerCase().equals(city.toLowerCase())
					&& (phonebook[i].myAddress.getState().toLowerCase().equals(state.toLowerCase()))) {
				phonebook[i].printPerson();
			}
		}

	}

	
	public void ascendingOrder() {
		  for (int i = 0; i < phonebook.length; i++) {
            for (int j = i + 1; j < phonebook.length; j++) {
                if (phonebook[i].getLastName().compareTo(phonebook[j].getLastName()) > 0) {
                    Person temp = phonebook[i];
                    phonebook[i] = phonebook[j];
                    phonebook[j] = temp;

                }
            }
		  
		  }
	}
	
	public void printPhonebook() {
		for (int i=0; i<phonebook.length; i++) {
			phonebook[i].printPerson();
		}
	}
	
	
	
}
	
	

