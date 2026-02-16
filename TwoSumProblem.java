package com.dailyPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSumProblem {

	public static void main(String[] args) {
		
		int[] arr = {2,5,8,9,4};
		
		System.out.println(isTwoSum(arr,7));
		System.out.println(isTwoSumV2(arr,15));
		

	}
	
	public static boolean isTwoSum(int[] arr, int val) {
		
		Map<Integer, Boolean> map = new HashMap<>();
		for(int i : arr) {
			if(map.containsKey(val-i)) {
				return true;
			}
			map.put(i, true);
		}
		
		return false;
	}
	
	public static boolean isTwoSumV2(int[] arr, int val) {
		Set<Integer> set = new HashSet<>();
		for(int i : arr) {
			if(set.contains(val-i)) {
				return true;
			}
			
			set.add(i);
		}
		return false;
	}

}
