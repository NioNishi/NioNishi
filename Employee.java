package com.example.mapandflatmap;

import java.util.List;

public class Employee {
	
	private Integer id;
	private String name;
	private List<String> citiesWorkedIn;
	public Employee(int i, String name, List<String> citiesWorkedIn) {
		this.id=i;
		this.name=name;
		this.citiesWorkedIn=citiesWorkedIn;
		// TODO Auto-generated constructor stub
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
	public List<String> getCitiesWorkedIn() {
		return citiesWorkedIn;
	}
	public void setCitiesWorkedIn(List<String> citiesWorkedIn) {
		this.citiesWorkedIn = citiesWorkedIn;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", citiesWorkedIn=" + citiesWorkedIn + "]";
	}
	
	
	

}
