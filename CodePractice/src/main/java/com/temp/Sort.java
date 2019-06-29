package com.temp;

import java.util.Comparator;

public class Sort {

	public static void main(String[] args) {
		int arr[] = new int[] {7,1,3,2,4,5,6};
		System.out.println("op: "+minimumSwaps(arr));
		print(arr);
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
			}
	}
	
	static int minimumSwaps(int[] arr) {
        int count=0;int j;
        
        Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1-o2;
			}
		};
        
        for(int i=0;i<arr.length;i++){
           int max=-1;
            for( j=0;j<arr.length-i-1;j++){
            	
                if(arr[j]>arr[j+1]){
                	 swap(arr,j,j+1);
                     count++;
                	
                }
               
            }
           
            print(arr);System.out.print(" :: "+i+" "+j);
            System.out.println("");
        }
        return count;
    }

    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
