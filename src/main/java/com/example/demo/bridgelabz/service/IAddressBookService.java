package com.example.demo.bridgelabz.service;

import java.util.List;

import com.example.demo.bridgelabz.dto.AddressBookDTO;
import com.example.demo.bridgelabz.model.AddressBookData;

public interface IAddressBookService {
	List<AddressBookData> getAddressBookData();
	
	AddressBookData getAddressBookDataById(int id);
	
	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);
	
	AddressBookData updateAddressBookData( int id,AddressBookDTO addressBookDTO);
	
	void deleteAddressBookData(int id);


}
