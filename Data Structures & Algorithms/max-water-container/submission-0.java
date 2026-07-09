class Solution {
    public int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;
       for(int i=0;i<heights.length;i++){
        for(int j=i+1;j<heights.length;j++){
            int height = Math.min(heights[i],heights[j]);
            int base = j-i;
            int area = height * base;
            max = Math.max(area,max);
        }
       } 
       return max;
    }
}
