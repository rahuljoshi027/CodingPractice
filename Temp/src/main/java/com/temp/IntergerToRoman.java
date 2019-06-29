package com.temp;

import java.util.HashMap;

public class IntergerToRoman {
static	HashMap<Integer,String> hm = new HashMap<Integer,String>();

	public static void main(String[] args) {
		hm.put(1,"I");
		hm.put(4, "IV");
		hm.put(5,"V");
		hm.put(9, "IX");
		hm.put(10,"X");
		hm.put(50,"L");
		hm.put(90, "XC");
		hm.put(100,"C");
		hm.put(90, "CD");
		hm.put(500,"D");
		hm.put(900,"CM");
		hm.put(1000,"M");
	}
	
	public void fun(int n) {
		
		String str = "";
		String base = "";
		while(n>0) {
			int q=n/10;
			int r=n%10;
			if(q==0) {
				str=str+getNumLessThan9(r);
			}
			
		}
		
	}
	
	public static String getNumLessThan9(int n) {
		if(n==9||n==4) {
			return hm.get(n);
		}
		String s="";
		int q=n/5;
		int r=n%5;
		if(q==0) {
			for(int i=0;i<r;i++) {
				s=s+hm.get(i);
			}
		}else {
			s="V";
			for(int i=0;i<r;i++) {
				s=s+hm.get(i);
			}
		}
		return s;
	}

}
