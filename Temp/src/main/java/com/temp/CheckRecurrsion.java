package com.temp;

public class CheckRecurrsion {

	public static void main(String[] args) {
		
		fun(5);
		
	}

	static int fun(int num) {
		int result;
		if(num==1)
			return 1;
		result = fun(num-1);
		System.out.println(result);
		return result;
	}
	
	
}
