class Solution {
    public int climbStairs(int n) {
        if (n<3) return n;
        int minus1 = 2;
        int minus2 = 1;
        for(int i=3;i<=n;i++){
            int currTerm = minus1+minus2;
            minus2=minus1;
            minus1=currTerm;
        }

        return minus1;
    }
}
