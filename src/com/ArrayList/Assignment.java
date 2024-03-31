package com.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Assignment {

	public static void main(String[] args) {
		ArrayList<String> teachers1 = new ArrayList<>();
		teachers1.add("Nimisha");
		teachers1.add("Nilesh");
		teachers1.add("Vishal");
		
		ArrayList<String> teachers2 = new ArrayList<>();
		teachers2.add("Ashvini");
		teachers2.add("Swati");
		teachers2.add("Yogita");
		
		ArrayList<String> teachers3 = new ArrayList<>();
		teachers3.add("Vijay");
		teachers3.add("Sandhya");
		teachers3.add("Mohini");
		
		//create department with teachers
		HashMap<String,ArrayList<String>> hmDepartment = new HashMap<>();
		hmDepartment.put("BCS",teachers1);
		hmDepartment.put("BCA",teachers2);
		hmDepartment.put("B.Tech",teachers3);
		
		//create college with department and teachers
		HashMap<String,HashMap<String,ArrayList<String>>> hmCollege = new HashMap<>();
		hmCollege.put("R.Y.K College nashik",hmDepartment);
		
		Set<String> key = hmCollege.keySet();
		Iterator<String> itr = key.iterator();
		
		while(itr.hasNext()) {
			String next = itr.next();
			System.out.println("College :"+next);
			
			HashMap<String,ArrayList<String>> hashMapState = hmCollege.get(next);
			Set<String> deptkeys = hashMapState.keySet();
			
			for(String department :deptkeys) {
				
				System.out.println("\n Department :"+department);
				System.out.println(" Teachers :"+hashMapState.get(department));
				
			}
		}
	}
}








