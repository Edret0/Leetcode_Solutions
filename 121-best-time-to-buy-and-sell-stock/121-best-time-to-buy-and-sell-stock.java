class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        int temp = 0;
        int sellStock = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < sellStock){
                sellStock = prices[i];
            }
            temp = prices[i] - sellStock;
            if(profit < temp){
                profit = temp;
            }
        }
        return profit;
        
    }
}