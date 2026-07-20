class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chArr = strs[i].toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(strs[i]);
        }
         return new ArrayList<>(map.values());

    }
}
