package com.temp;

import java.lang.ref.PhantomReference;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class CheckLinkedList {
	CheckLinkedList obj;// = new CheckLinkedList();
	static AtomicInteger i;
	PhantomReference<String> p;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("equals");
		return super.equals(obj);
	}
	
	public static void main(String args[]) {
		//obj = new CheckLinkedList();
		CheckLinkedList obj1 = new CheckLinkedList();
		obj1.fun();
		HashSet<CheckLinkedList> hs = new HashSet<CheckLinkedList>();
		hs.add(new CheckLinkedList());
		hs.add(new CheckLinkedList());
		hs.add(new CheckLinkedList());
		hs.add(new CheckLinkedList());
	}
	public void fun() {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>(){
			@Override
			protected boolean removeEldestEntry(java.util.Map.Entry<String, String> eldest) {
				System.out.println(" in remove eldest entry");
				return super.removeEldestEntry(eldest);
			}
		};
		lhm.put("a","a");
		lhm.put("b","a");
		lhm.put("c","a");
		lhm.put("d","a");
		//i.incrementAndGet();
	//System.identityHashCode();
		Runtime.getRuntime().gc();
	}
}
