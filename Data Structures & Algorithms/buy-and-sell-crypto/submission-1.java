class Solution {
    public int maxProfit(int[] p) {
        
        int l=0,r=1;
        int maxP = 0;
        while(r<p.length){
            if(p[l] < p[r]){
                maxP = Math.max(maxP, p[r]-p[l]);
            }else{
                l=r;
            }
            r++;
        }
        return maxP;
    }
}
