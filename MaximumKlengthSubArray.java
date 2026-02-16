package com.dailyPractice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class MaximumKlengthSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//practicing for the first time
	public void maximumInKSubArray(int[] arr, int k) {
		if(k <=0 || arr.length == 0 || arr == null || arr.length < k) {
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
			System.out.println(arr[q.peekFirst()]);
			
			while(!q.isEmpty() && q.peekFirst() <= i-k) {
				q.pollFirst();
			}
			
			while(!q.isEmpty() && arr[i] >= arr[q.peekLast()]) {
				q.pollLast();
			}
			
			q.offerLast(i);
		}
		
		if(!q.isEmpty()) {
			System.out.println(arr[q.pollLast()]);
		}
	}

}
