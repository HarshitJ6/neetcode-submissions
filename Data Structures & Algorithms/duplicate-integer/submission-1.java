class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> checkSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(checkSet.contains(nums[i])){
                return true;
            }else{
                checkSet.add(nums[i]);
            }
        }
        return false;
    }
}