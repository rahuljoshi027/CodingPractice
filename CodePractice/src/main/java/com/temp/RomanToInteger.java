package com.temp;

import java.io.File;
import java.util.HashMap;

public class RomanToInteger {
	
	public static void main(String args[]) {
		RomanToInteger o = new RomanToInteger();
		o.fun("MCMXCIV");
	}
	
	public void fun(String s) {
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		int val = 0;
		int curr = 0;
		int prev =0;
		for(int i=0;i<s.length();i++) {
			curr = hm.get(s.charAt(i));
			if(curr>prev) {
				
				val=val+(curr-(prev*2));
			}else {
				val = val+curr;
			}
			prev = curr;
			
		}
		
		System.out.println(" val : "+val);
	}

	
}
