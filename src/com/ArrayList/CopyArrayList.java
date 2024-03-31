package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
//1.	Program for copy one arraylist into another arraylist.
public class CopyArrayList {

	public static void main(String[] args) {
	 ArrayList<Integer> al = new ArrayList<Integer>();
	 al.add(10);
	 al.add(90);
	 al.add(40);
	 
	 ArrayList<Integer> al2 = new ArrayList<Integer>();
	 al2.add(1);
	 al2.add(2);
	 al2.add(3);
	 
	 al.addAll(al2);
	// System.out.println("copy arraylist is : "+al);
	 
	 Iterator<Integer> itr = al.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }

	}

}
