class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int cur = prices[0];
        
        for(int i=1; i<prices.length; i++) {
            if(cur > prices[i]) {
                cur = prices[i];
            } else if(cur < prices[i]) {
                profit += prices[i] - cur;
                cur = prices[i];
            }
        }
        
        return profit;
    }
}