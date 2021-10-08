package com.qa.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.main.data.Realm;

@Repository

public interface RealmRepo extends JpaRepository<Realm, Integer> {

}
