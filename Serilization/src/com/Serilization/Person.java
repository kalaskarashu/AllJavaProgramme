package com.Serilization;

import java.io.Serializable;

public class Person implements Serializable {
	String name;
	int id;
	String city;
	public Person(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
