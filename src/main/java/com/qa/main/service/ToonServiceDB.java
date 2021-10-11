package com.qa.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.main.data.Toon;
import com.qa.main.repo.ToonRepo;



@Service
public class ToonServiceDB {
	private ToonRepo repo;

	public ToonServiceDB(ToonRepo repo) {
		super();
		this.repo = repo;
	}
	
	public Toon getToonById(Integer id) {
		return repo.findById(id).get();
	}
	
	public List<Toon> getAllToons(){
		return repo.findAll();
	}
	
	public Toon createToon(Toon toon) {
		return repo.save(toon);
	}
	
	public Toon updateToon(Toon toon, Integer id) {
		Toon toUpdate = repo.findById(id).get();
		toUpdate.setName(toon.getName());
		toUpdate.setLevel(toon.getLevel());
		toUpdate.setRace(toon.getRace());
		toUpdate.setClazz(toon.getClazz());
		toUpdate.setGold(toon.getGold());
		toUpdate.setRealm(toon.getRealm());
		return repo.save(toUpdate);
	}
	
	public void deleteToonById(Integer id) {
		this.repo.deleteById(id);
	}
	

}
