class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        bcktck(nums,0,curr,res);
        return res;

    }
    public void bcktck(int[] nums, int index, List<Integer> curr,List<List<Integer>> res ){
            res.add(new ArrayList<>(curr));
            for(int i=index;i<nums.length;i++){
                curr.add(nums[i]);
                bcktck(nums,i+1,curr,res);
                curr.remove(curr.size()-1);
            }
    }
}
