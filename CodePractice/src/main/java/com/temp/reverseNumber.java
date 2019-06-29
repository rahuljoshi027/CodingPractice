package com.temp;

public class reverseNumber {

	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
	  public static int reverse(int x) {
	        boolean isNeg =false;
	        String s= Integer.toString(x);
	        int negAns=0;
	        if(s.charAt(0)=='-'){
	            isNeg = true;
	            s=s.replace("-","");
	        }
	        String ans="";
	        for(int j=s.length()-1;j>=0;j--){
	            ans=ans+s.charAt(j);
	        }
	        ans=ans.replace("0","");
	        if(isNeg){
	           negAns=Integer.parseInt(ans);
	           negAns=negAns-(negAns*2);
	            return negAns;
	        }
	        
	        return Integer.parseInt(ans);
	    }
}
