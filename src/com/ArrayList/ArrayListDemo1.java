package com.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(40);
		al.add(12);
		al.add(null);
		al.add("abc");
		
		for(Object o: al) {
			System.out.print(" "+o);
		}

	}

}
