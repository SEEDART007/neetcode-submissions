class Solution {
    public boolean checkInclusion(String s1, String s2) {
     int[] map1 = new int[26];
      if (s1.length() > s2.length())
            return false;
     for(int i=0;i<s1.length();i++){
        map1[s1.charAt(i)-'a']++;
     }
     for(int i=0;i<=s2.length()-s1.length();i++){
        int[] map2 = new int[26];
        for(int j=i;j<i+s1.length();j++){
            map2[s2.charAt(j)-'a']++;
        }
        if(isMatched(map1,map2)){
            return true;
        }
     }
        return false;

    }
    private boolean isMatched(int[] map1,int[] map2){
        for(int i=0;i<26;i++){
            if(map1[i]!=map2[i]) return false;
        }
        return true;
    }
}
