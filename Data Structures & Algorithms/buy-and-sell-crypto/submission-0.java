class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                max = Math.max(prices[j]-prices[i],max);
            }
        }
        if(max<0) return 0;
        return max;
    }
}
