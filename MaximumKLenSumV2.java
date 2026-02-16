package com.dailyPractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumKLenSumV2 {

	public static void main(String[] args) {
		
		int[] arr = {10,5,2,7,8,7};
		int k = 3;
		
		maxKsumLen(arr, k);
		

	}
	
	public static void maxKsumLen(int[] arr, int k) {
		if(arr==null || k==0 || arr.length ==0 || arr.length<k) {
			return;
		}
		
		Deque<Integer> q = new ArrayDeque<>();
		for(int i=0; i<k; i++) {
			while(!q.isEmpty() && arr[i] >= arr[q.peekLast()]) {
				q.pollLast();
			}
			
			q.offerLast(i);
			
		}
		
		for(int i=k; i<arr.length; i++) {
			
			System.out.print(arr[q.peekFirst()] + " ");
			
			while(!q.isEmpty() && q.peekFirst() <= i-k) {
				q.pollFirst();
			}
			
			while(!q.isEmpty() && arr[i] >= arr[q.peekLast()]) {
				q.pollLast();
			}
			
			q.offerLast(i);
		}
		
		if(!q.isEmpty()) {
			System.out.print(arr[q.peekFirst()]);
		}
	}

}
