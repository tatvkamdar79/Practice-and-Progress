class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, min = Integer.MAX_VALUE, idx = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
                idx = i;
            }
            else{
                if(i > idx)
                    profit = Math.max(profit, prices[i] - min);
            }
        }
        return profit;
    }
}