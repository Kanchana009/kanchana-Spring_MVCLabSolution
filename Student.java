package com.gl.SpringProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")


public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="country")
	private String country;
	
	
	@Column(name="department")
	private String department;
	
public Student() {
		
	}

public Student(String name, String country, String department) {
		super();
		this.name = name;
		this.country = country;
		this.department = department;
	}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", country=" + country + ", department=" + department + "]";
}	
	
	
	
}
