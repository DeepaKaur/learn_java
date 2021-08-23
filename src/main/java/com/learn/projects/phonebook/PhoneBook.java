package com.learn.projects.phonebook;

public class PhoneBook {
	private InputUI in = new InputUI();
	private Contact[] contacts = new Contact[10];
	private int count = 0;

	public void start() {
		int option = 0;
		do {
			option = entryApp();
		} while (option != 3);
	}

	public int entryApp() {
		int input = in.inputAction();

		switch (input) {
		case 1:
			addEntry();
			printContacts();
			break;
		case 2:
			searchEntry();
			break;
		case 3:
			exitApp();
			break;
		}
		
		return input;
	}

	public void addEntry() {
		contacts[count++] = in.inputContact();
	}


	public void searchEntry() {
		String name = in.inputSearchKeyword();
		
		for(int i=0;i<count;i++) {
			if(contacts[i].getFirstName().contains(name)) {
				System.out.println(contacts[i]);
				break;
			}
		}

	}

	public void exitApp() {
		// TODO Auto-generated method stub
		System.out.println("Exiting PhoneBook");

	}

	public void printContacts() {
		System.out.println("Current contacts: ");
		for (int i = 0; i < count; i++) {
			System.out.println(contacts[i]);
		}
	}

}
