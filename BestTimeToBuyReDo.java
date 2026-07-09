package com.dailyPractice;

public class BestTimeToBuyReDo {

	public static void main(String[] args) {
		int[] price = {7,1,5,3,6,4};
		System.out.println(maximumPrice(price));

	}
	
	public static int maximumPrice(int[] price) {
		if(price.length < 2 || price == null) {
			return 0;
		}
		
		int maxGain = 0;
		int priceVal = price[0];
		
		for(int i=1; i<price.length; i++) {
			if(price[i] < priceVal) {
				priceVal = price[i];
			} else {
				int currentGain = price[i] - priceVal;
				maxGain = Integer.max(maxGain, currentGain);
			}
			
		}
		
		return maxGain;
	}

}
