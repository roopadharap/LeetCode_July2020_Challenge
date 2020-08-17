public int maxProfit(int[] prices) 
{
	if(prices == null || prices.length < 2)
		return 0;
	
	int prevProfit = 0, currProfit = 0, prevBuy = -prices[0], prevSell = 0, currBuy = 0, currSell = 0;
	
	for(int i=1; i<prices.length; i++)
	{
		currBuy = Math.max(prevProfit - prices[i], prevBuy);
		currSell = prevBuy + prices[i];
		currProfit = Math.max(prevProfit, prevSell);
		
		prevBuy = currBuy;
		prevSell = currSell;
		prevProfit = currProfit;
	}
	
	return Math.max(prevSell, prevProfit);
}