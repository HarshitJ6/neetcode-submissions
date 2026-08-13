// class Solution {
//     public int maxSubArray(int[] nums) {
//         if(nums.length == 1) return nums[0];
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for(int x : nums){
//             currSum += x;
//             maxSum = Math.max(maxSum, currSum);
//             System.out.println();
//             if(currSum < 0){
//                 currSum =0;
//             }
//         }

//         return maxSum;
//     }


// }
public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0], curSum = 0;
        for (int num : nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += num;
            maxSub = Math.max(maxSub, curSum);
        }
        return maxSub;
    }
}