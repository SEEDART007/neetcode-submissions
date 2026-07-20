class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
           int maxFreq = -1;
           int elem = -1;
           for(int key : map.keySet()){
            if(map.get(key)>maxFreq){
                maxFreq = map.get(key);
                elem = key;
            }
           }
            ans[i] = elem;
            map.remove(elem);
        }
        return ans;
    }
}
