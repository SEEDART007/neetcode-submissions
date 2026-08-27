class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : stones){
            maxPq.add(num);
        }
        ArrayList<Integer> al = new ArrayList<>();
        while(!maxPq.isEmpty()){
            if(maxPq.size()==1) return maxPq.poll();
            int x = maxPq.poll();
            int y = maxPq.poll();
            if(x>y){
                maxPq.offer(x-y);
            }else if(x<y){
                maxPq.offer(y-x);
            }
        }

        return 0;
    }
}
