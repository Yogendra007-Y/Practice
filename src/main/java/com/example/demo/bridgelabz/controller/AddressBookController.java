package com.example.demo.bridgelabz.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bridgelabz.dto.AddressBookDTO;


@RestController
@RequestMapping("/AddressBook")
public class AddressBookController {

	/**
	 * @RequestMapping
	 * @return : ResponseEntity<String>
	 */
	@RequestMapping("/getAll")
	public ResponseEntity<String> getAllAddressBookData() {
		return new ResponseEntity<String>("Get call success", HttpStatus.OK);
	}

	/**
	 * @GetMapping
	 * @param id
	 * @return : ResponseEntity<String>
	 */
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getAddressBookData(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Get call success for id : " + id, HttpStatus.OK);
	}

	/**
	 * @PostMapping
	 * @param addressBookDTO
	 * @return : addressBookDTO and HttpStatus
	 */
	@PostMapping("/Create")
	public ResponseEntity<String> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
		return new ResponseEntity<String>("Created Address Book Data for :" + addressBookDTO, HttpStatus.OK);
	}

	/**
	 * @PutMapping
	 * @param addressBookDTO
	 * @return : addressBookDTO and HttpStatus
	 */
	@PutMapping("/Update")
	public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
		return new ResponseEntity<String>("Updated Address Book Data for" + addressBookDTO, HttpStatus.OK);
	}

	/**
	 * @DeleteMapping
	 * @param id
	 * @return : ResponseEntity<String>
	 */
	@DeleteMapping("/Delete/{id}")
	public ResponseEntity<String> deleteAddressBookData(@PathParam("id") int id) {
		return new ResponseEntity<String>("Delete call success for id " + id, HttpStatus.OK);
	}
}

