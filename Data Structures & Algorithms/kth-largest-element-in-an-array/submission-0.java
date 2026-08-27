class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            maxPq.add(num);
        }
        for(int i=0;i<k-1;i++){
            maxPq.poll();
        }
        return maxPq.poll();
    }
}
