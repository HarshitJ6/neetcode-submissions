class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        //add the elements to a hashSet to get o(1) set.contains calls
        Arrays.stream(nums).forEach(x->set.add(x)); 
        Integer longestSeq = 0;
        for(int i=0;i<nums.length;i++){
            //nums[i] is a sequence start if nums[i] - 1 is not in the set
            if(!set.contains(nums[i]-1)){
                Integer count = 1;
                Integer start = nums[i];
                //once seq start found, generate the longest possible seq
                while(set.contains(start+count)){
                    count++;
                }
                longestSeq = Math.max(longestSeq, count);
            }
        }
        return longestSeq.intValue();
    }
}
