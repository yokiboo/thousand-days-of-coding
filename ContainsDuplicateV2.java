package com.dailyPractice;

import java.util.Arrays;

public class ContainsDuplicateV2 {
	
	public static void main(String[] args) {
		int[] arr = {3,2,3,1};
		System.out.print(isContainDuplicates(arr));
	}
	
	public static boolean isContainDuplicates(int[] arr) {
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				return true;
			}
		}
		
		return false;
	}

}
