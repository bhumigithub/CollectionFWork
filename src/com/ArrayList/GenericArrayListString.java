package com.ArrayList;

import java.util.ArrayList;
//3.	Program for design the generic arraylist for String type only
public class GenericArrayListString {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("my");
		al.add("name");
		al.add("is");
		al.add("bhumi");
		
		for(String st:al) {
			System.out.print("\t"+st);
		}

	}

}
