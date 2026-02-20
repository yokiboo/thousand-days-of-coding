package com.dailyPractice;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {

		System.out.print(isDuplicate());
	}

	public static boolean isDuplicate() {
		int[] arr = {1,2,3,1};
		Set<Integer> set = new HashSet<>();
		
		for(int i : arr) {
			if(set.contains(i)) {
				return true;
			}
			
			set.add(i);
		}
		
		return false;
	}
}
