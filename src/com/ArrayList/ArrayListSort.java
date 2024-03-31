package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	//5. Program for sorting arraylist
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sakshi");
		al.add("bhumi");
		al.add("aditi");
		al.add("trupti");
		al.add("priti");
		al.add("chetna");
		al.add("dipali");
		al.add("kavita");
		al.add("rasika");
		al.add("vidya");
		al.add("monika");
		System.out.println("before sort :"+al);
		Collections.sort(al);
		
		System.out.println(al);
	}

}
