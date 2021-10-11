package com.qa.main.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.main.data.Realm;
import com.qa.main.repo.RealmRepo;



@Service
public class RealmServiceDB {
	private RealmRepo repo;

	public RealmServiceDB(RealmRepo repo) {
		super();
		this.repo = repo;
	}
	
	public Realm getRealmById(Integer id) {
		return repo.findById(id).get();
	}
	
	public List<Realm> getAllRealms(){
		return repo.findAll();
	}
	
	public Realm createRealm(Realm realm) {
		return repo.save(realm);
	}
	
	public Realm updateRealm(Realm realm, Integer id) {
		Realm toUpdate = repo.findById(id).get();
		toUpdate.setName(realm.getName());
		toUpdate.setRegion(realm.getRegion());
		return repo.save(toUpdate);
	}
	
	public void deleteRealmById(Integer id) {
		this.repo.deleteById(id);
	}
	
}
