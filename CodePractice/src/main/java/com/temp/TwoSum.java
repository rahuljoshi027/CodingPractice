package com.temp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
	int ans[] =	twoSum(new int[] {2,7,11,15}, 9);
	for(int i=0;i<ans.length;i++) {
		System.out.println(" Index is :: "+ans[i]);
	}
	}
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
