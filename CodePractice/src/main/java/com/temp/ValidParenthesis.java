package com.temp;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		ValidParenthesis o = new ValidParenthesis();
		System.out.println(o.isValid("\"[])\""));
	}
	
	 public boolean isValid(String s) {
	        
	        if(s.length()==0){
	            return true;
	        }
	          if(s.length()==1){
	            return false;
	        }
	        
	        Stack<Character> stack = new Stack();
	        
	        for(int i=0;i<s.length();i++){
	            
	            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
	                stack.push(s.charAt(i));
	            }
	           
	            if((s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}')){
	            
	                if(stack.size()==0){
	                    return false;
	                }
	                
	               if(s.charAt(i)==')' && stack.pop()!='(')
	               {
	                   return false;
	               }
	                  if(s.charAt(i)==']' && stack.pop()!='[')
	               {
	                   return false;
	               }
	                  if(s.charAt(i)=='}' && stack.pop()!='{')
	               {
	                   return false;
	               }
	            }
	           
	        }
	        if(stack.size()==0){
	            return true;
	        }else{
	            return false;
	        }
	    }
}
