package com.qa.main.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Realm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String region;

	public Realm() {
		super();
	}

	public Realm(Integer id, String name, String region) {
		super();
		this.id = id;
		this.name = name;
		this.region = region;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Realm [id=" + id + ", name=" + name + ", region=" + region + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, region);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Realm other = (Realm) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(region, other.region);
	}
	
	
	
}
