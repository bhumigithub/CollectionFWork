package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
//Program for design generic arraylist for Integer type only
public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(39);
		al.add(90);
		al.add(77);
		al.add(45);
		
		Iterator<Integer> itr =al.iterator();
		for(int i:al) {
			System.out.println(+i);
		}

	}

}
