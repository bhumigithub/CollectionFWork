package com.ArrayList;

import java.util.ArrayList;

public class MergArrayList {
	//6. Program for merging two arraylist into one arraylist
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(33);
		al.add(23);
		al.add(90);
		al.add(67);
		
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(56);
		al1.add(45);
		al1.add(43);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.addAll(al1);
		al2.addAll(al);
		
		System.out.println("Merge list element is : "+al2);

	}

}
