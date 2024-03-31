package com.ArrayList;

import java.util.ArrayList;

//4. Program for demonstrate the arraylist method
public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(89);
		al.add(33);
		System.out.println("size of list is :" +al.size());
		System.out.println("List :"+al);
		System.out.println(al.contains(67));

	}

}
