class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int col = matrix[0].length;
        int row = matrix.length;
        int high = col*row-1;
        while(low<=high){
            int mid = (low+high)/2;
            int rows = mid/col;
            int cols = mid%col;
            if(matrix[rows][cols]<target){
                low = mid+1;
            }else if(matrix[rows][cols]>target){
                high = mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
