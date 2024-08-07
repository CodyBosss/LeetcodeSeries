package SandyBoss;

public class BuyAndShellStock {
	public static void main(String [] args) {
		int prices [] = {7,8,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int [] prices) {
		if(prices.length==0 || prices==null) {
			return 0;
		}
		int minPrice = prices[0];
		int maxProfit = 0;
		
		for(int i=1; i<prices.length; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i]-minPrice);
		}
		return maxProfit;
	}

}
