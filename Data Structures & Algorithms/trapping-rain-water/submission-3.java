class Solution {
    public int trap(int[] h) {
        
        // int[] lmax = new int[h.length];
        // int[] rmax = new int[h.length];

        // lmax[0] = h[0];
        // rmax[h.length-1] = h[h.length-1];

        // for(int i=1;i<lmax.length;i++)
        //     lmax[i] = Math.max(lmax[i-1], h[i]);

        // for(int i=lmax.length-2;i>=0;i--)
        //     rmax[i] = Math.max(rmax[i+1], h[i]);    

        // int ans =0;
        // for(int i=0 ; i<h.length; i++){
        //     ans += Math.min(lmax[i],rmax[i]) - h[i];
        // }
        int ans=0;
        int lm=0,rm=0;
        int l=0,r=h.length-1;
        while(l < r){
            lm=Math.max(lm,h[l]);
            rm=Math.max(rm,h[r]);

            if(h[l] <= h[r]){
                ans += lm - h[l];
                l++;
            }else{
                ans += rm - h[r];
                r--;
            }
        }
        return ans;
    }
}
