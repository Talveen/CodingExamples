/*
 * Written exam on 21st Jan 1130am
 * 
 * WAP to find the duplicate elements in an array. Preserve the order of appearance
 * 
 * Input: {1,2,2,3,4,5,6,7,7,8,9,7,8,2}
 * O/P: {2,7,8}
 * 
 * */

package com.wintal.written.uhg;

import java.util.stream.IntStream;

public class UHG_TestQuestion {

	public static void main(String[] args) {
		int[] arr={1,2,3};
		distinctElements(arr);
	}
	
	public static void distinctElements(int[] arr){
		
		int[] arr2 = new int[arr.length-1];
		int[] arrD = new int[5];
		
		for(Integer i : arr){
			int k = 0;
			for(int j=1;j<arr.length;j++){
				arr2[k]=arr[j];
				k++;
			}
			boolean contains = IntStream.of(arr2).anyMatch(x -> x == arr[i]);
			System.out.println(i+" "+contains);
		}
		
	}
	/*public static void main(String[] args) {
	int[] a = {1,2,3,4};
	boolean contains = IntStream.of(a).anyMatch(x -> x == 4);
	System.out.println(" "+contains);
	boolean contains2 = IntStream.of(a).anyMatch(x -> x == 5);
	System.out.println(" "+contains2);
	}*/
}
