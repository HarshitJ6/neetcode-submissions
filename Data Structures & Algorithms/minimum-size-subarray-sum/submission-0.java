class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int currentSum = 0;
        int minArrLen = Integer.MAX_VALUE;

        for(int r=0;r<nums.length;r++){
            currentSum += nums[r];
            while(currentSum >= target){
                minArrLen = Math.min(minArrLen, (r-l+1));
                currentSum -= nums[l];
                l++;
            }
        }

        return minArrLen == Integer.MAX_VALUE ? 0 : minArrLen;
    }
}