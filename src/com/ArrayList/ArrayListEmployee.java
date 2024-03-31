package com.ArrayList;
//7. create the arraylist for user defined type for employee
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(20,"ram","2500"));
		arrayList.add(new Employee(34,"sham","4500"));
		
		Iterator<Employee> itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			System.out.println("employee list :" +itr.next());
		}
		
		for(Employee e1 : arrayList) {
			System.out.println("data is :"+e1);
		}

	}

}
