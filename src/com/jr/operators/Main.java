package com.jr.operators;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// create a new arraylist
		String[] myArr = {"1","10","jay","ed"};
		List<String> myList = new ArrayList<String>();
		
		// add several elements
		for (String s : myArr) {
			myList.add(s);
		}
		
		// print out the entire arrayList
		System.out.println("my-list: "+myList);
		
		// Get specific elements
		System.out.println("Item 2 from list: "+myList.get(1));
		
		//set different elements
		System.out.println("replace item 2 with 20: "+myList.set(1, "20"));
		System.out.println("Updated myList: "+myList);
		
		//Remove elements
		
		
		
//		int [] myArray2 = {1,2,3,4,5};  
//		List<Integer> myIntList = new ArrayList<>();
	}
}
