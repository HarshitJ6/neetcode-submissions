class Solution {
    public int[] productExceptSelf1(int[] nums) {
        int zeros = 0;
        int idx = -1;
        int prod = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zeros++;
                idx = i;
            }else {
                prod*=nums[i];
            }
        }
        int arr[] = new int[nums.length];
        if(zeros > 1){
            return Arrays.stream(nums).map(x->0).toArray();
        }else if(zeros == 1){
            arr[idx] = prod;
            return arr;
        }else{
            for(int i=0;i<nums.length;i++){
                arr[i] = prod/nums[i];
            }
            return arr;
        }
    }
    public int[] productExceptSelf(int[] nums) {
        int prefix =1;
        int postfix=1;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int ith = nums[i];
            arr[i] = prefix;
            prefix*=ith;
        }
        for(int i=nums.length-1;i>=0;i--){
            int ith = nums[i];
            arr[i] *= postfix;
            postfix*=ith;
        }

        return arr;

    }
}  
