class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target && matrix[i][matrix[0].length-1]>=target){
                return BS(matrix[i],target);
            }
        }
        return false;
    }
    private boolean BS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<target){
                start = mid+1;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
