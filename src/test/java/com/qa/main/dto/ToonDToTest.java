package com.qa.main.dto;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;

import com.qa.main.dto.ToonDTO;



@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ToonDToTest {

	@Test
	void testToonDTO() {
		ToonDTO dto = new ToonDTO();
		assertTrue(dto instanceof ToonDTO);
	}
	
	@Test
	void testFullDTO() {
		ToonDTO dto = new ToonDTO(1, "Gonzalo", 1, "Night Elf", "Warrior", 100);
		assertTrue(dto instanceof ToonDTO);
	}

	@Test
	void testGandS() {
		ToonDTO dto = new ToonDTO(2, "Gonzalo", 1, "Night Elf", "Warrior", 100);
		
		assertEquals("Warrior", dto.getClazz());
		assertEquals(100, dto.getGold());
		assertEquals(2, dto.getId());
		assertEquals("Gonzalo", dto.getName());
		assertEquals("Night Elf", dto.getRace());
		assertEquals(1, dto.getLevel());
	
	}
	
	@Test
	void testtoString() {
		ToonDTO dto = new ToonDTO(3, "Gonzalo", 1, "Night Elf", "Warrior", 100);
		String expected = "ToonDTO [id=" + dto.getId() + ", name=" + dto.getName() + ", level=" + dto.getLevel() +
				", race=" + dto.getRace() + ", clazz=" + dto.getClazz()+ ", gold=" + dto.getGold() + "]";
		assertEquals(expected,dto.toString());
	}
	
}
