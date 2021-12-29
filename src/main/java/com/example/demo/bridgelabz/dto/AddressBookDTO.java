package com.example.demo.bridgelabz.dto;

public class AddressBookDTO {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private long phoneNumber;

	public AddressBookDTO( String firstName, String lastName, String address, String city, long phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [ firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", city=" + city + ", phoneNumber=" + phoneNumber + "]";
	}



}
