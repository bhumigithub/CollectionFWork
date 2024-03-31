package com.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AssignmentUsingSet {

	public static void main(String[] args) {
		HashSet<String> teachers1 = new HashSet<>();
		teachers1.add("Nimisha");
		teachers1.add("Nilesh");
		teachers1.add("Vishal");
		
		HashSet<String> teachers2 = new HashSet<>();
		teachers2.add("Ashvini");
		teachers2.add("Swati");
		teachers2.add("Swati");
		
		HashSet<String> teachers3 = new HashSet<>();
		teachers3.add("Vijay");
		teachers3.add("Sandhya");
		teachers3.add("Mohini");
		
		//create department with teachers
				HashMap<String,HashSet<String>> hmDepartment = new HashMap<>();
				hmDepartment.put("BCS",teachers1);
				hmDepartment.put("BCA",teachers2);
				hmDepartment.put("B.Tech",teachers3);
				
				//create college with department and teachers
				HashMap<String,HashMap<String,HashSet<String>>> hsCollege = new HashMap<>();
				hsCollege.put("R.Y.K College nashik",hmDepartment);
				
				Set<String> key = hsCollege.keySet();
				Iterator<String> itr = key.iterator();
				
				while(itr.hasNext()) {
					String next = itr.next();
					System.out.println("College :"+next);
					
					HashMap<String,HashSet<String>> hashMapState = hsCollege.get(next);
					Set<String> deptkeys = hashMapState.keySet();
					
					for(String department :deptkeys) {
						
						System.out.println("\n Department :"+department);
						System.out.println(" Teachers :"+hashMapState.get(department));
						
					}
				}
				
				
	}

}
