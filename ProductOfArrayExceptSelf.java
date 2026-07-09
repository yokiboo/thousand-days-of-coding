package com.dailyPractice;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] productArray = productArray(arr);
		
		for(int i : productArray) {
		System.out.println(i);
		}

	}
	
	public static int[] productArray(int[] arr) {
		int[] answer = new int[arr.length];
		
		answer[0] = 1;
		
		for(int i=1; i<arr.length; i++) {
			answer[i] = answer[i-1] * arr[i-1];
		}
		
		int suf = 1;
		for(int i=arr.length-1; i>= 0; i--) {
			answer[i] = suf * answer[i];
			suf = arr[i] * suf;
		}
		
		return answer;
	}

}
