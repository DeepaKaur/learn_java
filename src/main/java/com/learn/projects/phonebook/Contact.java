package com.learn.projects.phonebook;

public class Contact {
	private String firstName;
	private String lastName;
	private String phoneNo;

	public Contact(String firstname, String lastname, String phonenumber) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.phoneNo = phonenumber;
	}
	

	public String getFirstName() {
		return firstName;
	}


	public String toString() {
		return firstName + " " + lastName + " " + phoneNo;
	}

}
