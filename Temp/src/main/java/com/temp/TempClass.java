package com.temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class TempClass{
	
	public static void main(String args[]) {
		System.out.println("started");
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		hm.put('a', 1);
		hm.put('b', 2);
		hm1.put('a', 1);
		hm1.put('b', 2);char ch1 = 'c';char ch2 = 'c';
		int n1 =1;int n2 =1;String s1 = "hi";String s2 = "hi";
		System.out.println("op is "+(ch1==ch2));
		hm.forEach((k,v)->System.out.println(" "+k.charValue()+" "+v.intValue()));
		long count = hm.keySet().stream().filter(k->hm1.containsKey(k)).filter(k->hm1.get(k).intValue()==hm.get(k).intValue()).count();
		System.out.println(" count "+count+" "+hm.size());
		/*
		Scanner s = new Scanner(System.in);
		System.out.println(" enter :: ");
		//String str = s.nextLine();
		//System.out.println(" op :: "+str);
		Optional<String> o = Optional.of("hi");
		System.out.println(o.isPresent());
		System.out.println(o);
		List<String> l = new ArrayList<String>();
		String str = "hi";
		l.add(str);*/
	}
	
}
