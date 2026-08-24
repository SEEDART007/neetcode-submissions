class Solution {
    public int reverse(int x) {
        long rev = 0;
        boolean isNeg = false;
        if(x<0){
            isNeg = true;
            x=Math.abs(x);
        }
        while(x>0){
            int last = x%10;
            rev = rev *10 + last;
            x=x/10;
        }
        if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
        if(isNeg) return (int)(-1*rev);

        return (int)rev;
    }
}
