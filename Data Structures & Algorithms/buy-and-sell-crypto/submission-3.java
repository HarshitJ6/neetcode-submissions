class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int leastLeft = prices[0];

        for(int i = 1; i<prices.length; i++){
            if(leastLeft > prices[i]){
                leastLeft = prices[i];
            }else{
                maxProfit = Math.max(maxProfit, prices[i] - leastLeft);
            }
        }

        return maxProfit;
    }
}
