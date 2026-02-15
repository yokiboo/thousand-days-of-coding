package com.dailyPractice;

import java.util.Stack;

public class RearrangeArrayBasedOnSigns {

	public static void main(String[] args) {
		String signs = "+-+-+";
		int[] arr = arrangeArray(signs);
		
		for(int i : arr) {
			System.out.println(i);
		}

	}
	
	public static int[] arrangeArray(String signs) {
		if(signs == null || signs.isBlank() || signs.isEmpty()) {
			return new int[] {};
		}
		
		int num = 0;
		int[] arr = new int[signs.length()+1];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<signs.length(); i++) {
			if(signs.charAt(i) == '+') {
				arr[i] = num++;
			} else {
				stack.push(i);
			}
		}
		
		arr[signs.length()] = num++;
		
		while(!stack.isEmpty()) {
			arr[stack.pop()] = num++;
		}
		
		return arr;
	}

}
