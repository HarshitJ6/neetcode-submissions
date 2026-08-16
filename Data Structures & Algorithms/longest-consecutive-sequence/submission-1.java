class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(x->set.add(x)); 
        Integer longestSeq = 0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                Integer count = 1;
                Integer start = nums[i];
                while(set.contains(start+count)){
                    count++;
                }
                longestSeq = Math.max(longestSeq, count);
            }
        }
        return longestSeq.intValue();
    }
}
