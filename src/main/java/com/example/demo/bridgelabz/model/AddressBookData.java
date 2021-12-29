package com.example.demo.bridgelabz.model;

import com.example.demo.bridgelabz.dto.AddressBookDTO;

public class AddressBookData {
	private long contactId;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private long phoneNumber;

	public AddressBookData() {
		super();
	}

	public AddressBookData(long contactId,AddressBookDTO addressBookDTO) {
		super();
		this.contactId = contactId;
		this.firstName = addressBookDTO.firstName;
		this.lastName = addressBookDTO.lastName;
		this.address = addressBookDTO.address;
		this.city = addressBookDTO.city;
		this.phoneNumber = addressBookDTO.phoneNumber;
	}

	public long getContactId() {
		return contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}


