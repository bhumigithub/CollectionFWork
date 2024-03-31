package com.ArrayList;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
        ArrayList arrayList= new ArrayList();
		
		arrayList.add(50);
		arrayList.add(10);
		arrayList.add('A');
		
		for(Object o: arrayList) {
			System.out.println(o);
		}

	}

}
