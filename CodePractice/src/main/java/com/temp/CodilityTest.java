package com.temp;

import java.util.Arrays;

public class CodilityTest {

	public static void main(String[] args) {
		System.out.println("hi");
		solution(new int[]{1, 3, 6, 4, 1, 2});
	//	Arrays.sort(a);
		int x =10;
		String s = Integer.toString(x);s.le 
		int ans[]= new int[2];
 
	}
	
	 public static int solution(int[] A) {
	        Arrays.sort(A);
	        int number=0;
	        System.out.println(A.toString());
	        System.out.println("start");
	        for(int i=0;i<A.length;i++) {
	        	System.out.println(A[i]);
	        }
	        System.out.println("end");
	        System.out.println(A.length);
	        for(int i=0;i<A.length;i++){
	        	System.out.println(i);
	            if(i!=(A.length-1)){
	            	System.out.println("in if");
	                if(A[i+1]-A[i]==1){
	                    continue;
	                }
	                number = A[i]+1;
	                System.out.println("end "+i);
	            }
	            if(!(A[i]-A[i-1]==1)){
	               number = A[i]+1;
	            }
	            
	        }
	        if(number<=0){
	            number=1;
	        }
	        return number;
	    }
}
