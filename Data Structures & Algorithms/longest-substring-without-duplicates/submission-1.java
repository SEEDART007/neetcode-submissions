class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max =   Integer.MIN_VALUE;
        while(right<s.length()){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                max = Math.max(max,right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
