class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        bcktck(nums,0,curr,res);
        return res;

    }
    public void bcktck(int[] nums, int index, List<Integer> curr,List<List<Integer>> res ){
          if(index==nums.length){
            res.add(new ArrayList<>(curr));
            return;
          }
          curr.add(nums[index]);
          bcktck(nums,index+1,curr,res);
          curr.remove(curr.size()-1);
          bcktck(nums,index+1,curr,res);
    }
}
