class Solution {
    public int maxProfit(int[] prices) {
        //only care about the min value and check further

     int maxProfit=0;
     int minPrice=prices[0];
     if(prices==null||prices.length==0)
     return 0;
      
      for(int i=0;i<prices.length;i++){
        if(minPrice>prices[i])
        minPrice=prices[i];
        else
        {
        int profit=prices[i]-minPrice;
        maxProfit=Math.max(maxProfit,profit);
        }
              }
       
        return maxProfit; 
    }
}