class Solution {
  public int maxProfit(int[] prices) {
    int buy = prices[0];
    int i = 1;
    int profitSoFar = 0;
    while(i < prices.length) {
      int price = prices[i];
      if(price < buy) {
        buy = price;
      } else {
        while(i < prices.length - 1 && prices[i+1] > prices[i]) i++;
        profitSoFar += prices[i] - buy;
        buy = prices[i];
      }
      i++;
    }
    return profitSoFar;
  }
}