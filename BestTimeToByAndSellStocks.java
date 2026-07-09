package com.dailyPractice;

public class BestTimeToByAndSellStocks {

	public static void main(String[] args) {
		int[] price = {7,1,5,3,6,4};
		System.out.println("Maximum Profit : "+maxProfit(price));

	}
	
	//brute force approach
	public static int maxProfit(int[] arr) {
		if(arr == null || arr.length < 2) {
			return 0;
		}
		
		int maxProfit = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j < arr.length; j++) {
				int profit  = arr[j] - arr[i];
				
				if(profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}
		
		return maxProfit;
	}

}
