package com.temp;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

	public static void main(String[] args) {
		LongestUniqueSubstring o = new LongestUniqueSubstring();
		o.fun("aabcabcbb");
	}
		
	public static void fun(String s) {
		
		int max =0;
		String str="";
		for(int i=0;i<s.length();i++) {
			int count = 0;
			Set<Character> set = new HashSet<Character>();
			String sub="";
			for(int j=i;j<s.length();j++) {
				if(!set.contains(s.charAt(j))) {
					count++;
					sub=sub+s.charAt(j);
					set.add(s.charAt(j));
				}else {
					break;
				}
				if(count>max) {
					max=count;
					str=sub;
				}
			}
		}
		
		System.out.println(" max: "+max+" str: "+str);
	}
}
