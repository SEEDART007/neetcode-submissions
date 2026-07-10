class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int ans = Integer.MAX_VALUE;
        int low = 1; int high = piles[piles.length-1];
        while(low<=high){
            int mid = (low+high)/2;
            int time = getTime(piles,mid);
            if(time<=h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
            return ans;
    }
    private int getTime(int[] piles,int k){
        int totalHr = 0;
        for(int i=0;i<piles.length;i++){
            totalHr += Math.ceil((double)piles[i]/k);
        }
        return totalHr;
    }
}
