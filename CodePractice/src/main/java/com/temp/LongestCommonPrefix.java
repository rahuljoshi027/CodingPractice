package com.temp;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix o = new LongestCommonPrefix();
		System.out.println(o.longestCommonPrefix(new String[]{"abca","aba","aaab"}));
	}
	
	 public String longestCommonPrefix(String[] strs) {
	        
	        if(strs.length==0){
	            return "";
	        }
	        
	        String str = strs[0];
	        
	        for(int i=0;i<strs.length-1;i++){
	            
	            while(!strs[i+1].toLowerCase().startsWith(str.toLowerCase())){
	                if(str.length()==1){
	                 return "";   
	                }
	                   str=str.substring(0,str.length()-1);      
	            }
	            
	           
	         
	        }
	        
	        return str;
	    }
}
