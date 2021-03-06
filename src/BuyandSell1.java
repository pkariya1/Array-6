//time complexity=>O(n)
public class BuyandSell1 {
	public int maxProfit(int[] prices) {
		int totalprofit = 0;
		int buy = prices[0];
		for (int i = 0; i < prices.length; i++) {

			buy = Math.min(buy, prices[i]);
			totalprofit = Math.max(totalprofit, prices[i] - buy);

		}
		return totalprofit;

	}
}
