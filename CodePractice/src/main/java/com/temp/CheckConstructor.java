package com.temp;

import java.util.ArrayList;

import com.sun.xml.internal.ws.util.StringUtils;

public class CheckConstructor {

	CheckConstructor(ArrayList<String> a){
		System.out.println("in arraylist ");
	}
	
	CheckConstructor(Object o){
		System.out.println(" in object");
	}
	
	public static void main(String[] args) {
		String s = "hi";String s1 = "hi";
		CheckConstructor c = new CheckConstructor(null);
		int count = 0;
		
		System.out.println(" opt :: "+(5|8));
		System.out.println(" opt :: "+~5);
		
		int end = Integer.MAX_VALUE;
		int start = Integer.MAX_VALUE -100;
		System.out.println(end);
		System.out.println(start);
		
		for(;start<end;start++) {
			System.out.println(start);
			count++;break;
			}
		System.out.println(count);
		System.out.println(" done ok ");
		
	}

}
