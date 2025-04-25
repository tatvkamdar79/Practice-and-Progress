class Solution {
  public int maxProfit(int[] prices) {
    int profit = 0;
    int n = prices.length;
    int buy = prices[0];
    for(int i = 1; i < n; i++) {
      if(prices[i] < buy) buy = prices[i];
      else {
        profit += prices[i] - buy;
        buy = prices[i];
      }
    }
    return profit;
  }
}

// 7 1 5 3 6 4
// 1 1 2 1 2 1


// 1 2 3 4 5
// 1 2 3 4 5