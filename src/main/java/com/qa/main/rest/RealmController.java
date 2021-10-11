package com.qa.main.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.main.data.Realm;
import com.qa.main.service.RealmServiceDB;

@RestController
public class RealmController {
	
	private RealmServiceDB service;

	public RealmController(RealmServiceDB service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/getRealmById/{id}")
	public Realm getRealm(@PathVariable Integer id) {
		return service.getRealmById(id);
	}
	
	@GetMapping("/getAllRealms")
	public List<Realm> getAllRealms(){
		return service.getAllRealms();
	}
	
	@PostMapping("/createRealm")
	public ResponseEntity<Realm> createRealm(@RequestBody Realm realm){
		Realm responseBody = service.createRealm(realm);
		return new ResponseEntity<Realm>(responseBody, HttpStatus.CREATED);
	}
	
	@PutMapping("/updateRealm/{id}")
	public ResponseEntity<Realm> updateRealm(@RequestBody Realm realm, @PathVariable Integer id){
		Realm responseBody = service.updateRealm(realm, id);
		return new ResponseEntity<Realm>(responseBody, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteRealm/{id}")
	public ResponseEntity<Realm> deleteRealm(@PathVariable Integer id){
		service.deleteRealmById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}