package com.temp;

import java.util.HashMap;

public class RansomeNoteCheck {

	public static void main(String[] args) {
		RansomeNoteCheck o = new RansomeNoteCheck();
		System.out.println(o.canConstruct("abc", "cccbbbammmxx"));
	}
	 public boolean canConstruct(String ransomNote, String magazine) {
	        
	        HashMap<Character,Integer> ranNote;
	        HashMap<Character,Integer> mag;
	        ranNote = convertToMap(ransomNote);
	        mag = convertToMap(magazine);
	        
	        for(int i=0;i<ransomNote.length();i++){
	            if(mag.containsKey(ransomNote.charAt(i)) && (mag.get(ransomNote.charAt(i))).intValue() >= (ranNote.get(ransomNote.charAt(i))).intValue()){
	                continue;
	            }else{
	                return false;
	            }
	            
	        }
	        
	        return true;
	        
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
