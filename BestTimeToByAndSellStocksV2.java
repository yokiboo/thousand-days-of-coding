package com.dailyPractice;

public class BestTimeToByAndSellStocksV2 {

	public static void main(String[] args) {
		int[] price = {7,1,5,3,6,4};
		System.out.println(maxProfit(price));
	}
	
	public static int maxProfit(int[] arr) {
		if(arr.length<2 || arr == null) {
			return 0;
		}
		
		int maxProfit = 0;
		int price = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < price) {
				price = arr[i];
			} else {
				int currentProfit = arr[i] - price;
				maxProfit = Integer.max(maxProfit, currentProfit);
			}
		}
		
		return maxProfit;
		
	}

}
