package com.ArrayList;

import java.util.*;

public class GetEmployeeList {
	
	public List<Employee> getEmployeeList(){
		//8.  Design the method to return the list of Employees in arraylist.
		List<Employee> list= new ArrayList<Employee>();
		list.add(new Employee(4,"Jeevan","kulkarni"));
		list.add(new Employee(3, "ram", "34875") );
		return list;
	}
	
	public ArrayList getEmployeeData() {
		//9. Design the method to return arraylist to method	
		ArrayList arrlist= new ArrayList<>();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(40);
		
		return arrlist;
		
	}
}
