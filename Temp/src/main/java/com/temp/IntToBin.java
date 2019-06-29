package com.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntToBin {

	public static void main(String[] args) {
		int arr[] = new int[]{5,3,7,10,14};
		List<String> str = new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		List<List<String>> l = new ArrayList<List<String>>();
		for(int i=0;i<arr.length;i++) {
		System.out.println(" "+Integer.toBinaryString(arr[i]));
		str.add(Integer.toBinaryString(arr[i]));
		}
		
		Comparator<String> c = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				int s1 = getNumeberOfOnes(o1);
				int s2 = getNumeberOfOnes(o2);
				if(s1==s2) {
				return Integer.parseInt(o1, 2) - Integer.parseInt(o2, 2);
				}
				return o1.compareTo(o2);
			}

			private int getNumeberOfOnes(String o1) {
				return o1.replace("0","").length();
				
			}
		};
		
		System.out.println(" "+str.toString());
		Collections.sort(str,c);
		System.out.println(" "+str.toString());
		for(int i=0;i<str.size();i++) {
		ans.add(Integer.parseInt(str.get(i), 2));
		System.out.println(" "+Integer.parseInt(str.get(i), 2));
		}
		
		for(int i=0;i<str.size();i++) {}
		
	}

}
