class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0], profit=0;
        
        
        
        for(int i=0; i<prices.length; i++){
            if(prices[i]<bp)
            {
                bp=prices[i];
                
            }
            
            else{
            profit=Math.max(profit, prices[i]-bp);
            }
        }
        
        return profit;
     }
}

