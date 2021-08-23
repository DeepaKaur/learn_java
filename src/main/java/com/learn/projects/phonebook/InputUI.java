package com.learn.projects.phonebook;

import java.util.Scanner;

public class InputUI {

	private Scanner sc = new Scanner(System.in);

	public int inputAction() {
		//do while to take option 1 - add, 2 - search, 3 - exit
		System.out.println();
		System.out.print("Enter 1 to add an entry, 2 to search, 3 to exit: ");
		
		return Integer.parseInt(sc.nextLine());
	}
	

	public Contact inputContact() {
		System.out.println("Add entry:");
		System.out.print("Enter the first name: ");
		String fName = sc.nextLine();
		System.out.print("Enter the last name: ");
		String lName = sc.nextLine();
		System.out.print("Enter the phone number: ");
		String phone = sc.nextLine();

		Contact c = new Contact(fName, lName, phone);
		return c;
	}
	
	public String inputSearchKeyword() {
		System.out.print("Enter first name keyword to search: ");
		return sc.nextLine();
	}

}
