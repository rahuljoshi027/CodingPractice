package com.temp;

import java.util.HashMap;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		FirstUniqueCharacter o = new FirstUniqueCharacter();
		System.out.println(o.firstUniqChar("leetcode"));
	}

	 public int firstUniqChar(String s) {
	        HashMap<Character,Integer> map = convertToMap(s);
	        
	        for(int i=0;i<s.length();i++){
	            if(map.get(s.charAt(i)).intValue() == 1){
	                return i;
	            }
	        }
	        
	        return -1;
	    }
	    
	     public HashMap convertToMap(String input){
		        HashMap<Character,Integer> map = new HashMap<>();
		        for(int i=0;i<input.length();i++){
		            if(map.containsKey(input.charAt(i))){
		                map.put(input.charAt(i), (map.get(input.charAt(i)).intValue())+1);
		            }else {
		            	 map.put(input.charAt(i),1);
		            }
		        }
		        return map;
		    }
}
