package com.qa.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.main.data.Character;

@Repository

public interface CharacterRepo extends JpaRepository<Character, Integer>{


}
