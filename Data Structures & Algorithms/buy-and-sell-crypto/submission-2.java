class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0], profit=0;
        int amt=0;
        int dp[]=new int[prices.length-1];
        Arrays.fill(dp, 0);
        for(int i=0; i<prices.length; i++){
            if(prices[i]<bp)
            {
                bp=prices[i];
                amt=i;
            }
            
            else{
            profit=Math.max(profit, prices[i]-bp);
            }
        }
        
        return profit;
     }
}

