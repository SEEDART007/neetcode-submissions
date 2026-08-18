class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        bcktck(nums,0,curr,res);
        return res;
    }
    public void bcktck(int[] nums,int idx, List<Integer> curr, List<List<Integer>> res){
        if(idx==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[idx]);
        bcktck(nums,idx+1,curr,res);
        curr.remove(curr.size()-1);
        while((idx+1)<nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }
         bcktck(nums,idx+1,curr,res);
    }
}
