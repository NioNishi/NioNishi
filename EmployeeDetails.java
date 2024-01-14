package com.example.mapandflatmap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
	
	
	public static void main(String args[]) {
		
		List <String> citiesWorkedIn= new ArrayList<String>();
		
		citiesWorkedIn.add("Kochi");
		citiesWorkedIn.add("TVM");
		citiesWorkedIn.add("Banglore");
		citiesWorkedIn.add("Netherlands");
		citiesWorkedIn.add("Germany");
		
		Employee e1= new Employee(1,"Nishika",citiesWorkedIn);
		List <String> citiesWorkedIn1= new ArrayList<String>();

		citiesWorkedIn1.add("Kochi");
		citiesWorkedIn1.add("Netherlands");
		citiesWorkedIn1.add("Germany");
		Employee e2= new Employee(1,"Midhun",citiesWorkedIn1);
		List <String> citiesWorkedIn2= new ArrayList<String>();

		citiesWorkedIn2.add("Kochi");
		citiesWorkedIn2.add("Banglore");

		Employee e3= new Employee(1,"Mridul",citiesWorkedIn1);
		
		
		//List<Employee> employeeList= 

		
		
		

		
		
	}

}
