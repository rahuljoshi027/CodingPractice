package com.temp;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

interface A{
	void fun();
}

interface B{
	void fun();
}

class emp{
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


public class CheckInteface implements A,B{
	interface x{}
	@Override
	public void fun() {
		
		
	}
	
	public void fun(Object o) {
		System.out.println(" in obj");
	}
	
	public void fun(String s) {
		System.out.println(" in string");
	}
	
	public static void main(String args[]) {
		
		emp e = new emp();
		
		CheckInteface c = new CheckInteface();
		Comparator<String> c1 = null;
		Map<String,String> tm = new TreeMap<String,String>(c1);
		Set<String> s = new TreeSet<String>() {
			public int hashCode() {
				System.out.println("in Hascode");
				return 0;
			}
			
			public boolean equals(String s) {
				System.out.println("in equals");
				return false;
			}
		};
		s.add("hi");
		System.out.println(" done adding");
		e.setName("rj");
		e=null;
		if(null != e) {
			System.out.println(" not null 1");
		} 
			
		if(e != null) {
			System.out.println(" not null 2");
		}
		
		if(null != e.getName()) {
			System.out.println("not null 3");
		}
		
		if(e.getName() != null) {
			System.out.println("not null 4");
		}
	}

}



