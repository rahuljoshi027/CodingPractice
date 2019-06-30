package com.temp;

public class ReverseIntegr {

	public static void main(String[] args) {
		System.out.println("revese is  "+reverse(123));
	}
	
	public static int reverse(int x) {
        boolean isNeg =false;
        if(x==0){
            return 0;
        }
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
        for(int i=0;i<ans.length();i++){        
            if(ans.charAt(i)!=0){
                break;
            }
            ans=ans.replaceFirst("0","");
        }
         try{
        if(isNeg){
           negAns=Integer.parseInt(ans);
           negAns=negAns-(negAns*2);
            return negAns;
        }
       
        return Integer.parseInt(ans);
        }catch(Exception e){
            return 0;
        }
    }

}
