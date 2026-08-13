class Solution {
    public int longestConsecutive(int[] nums) {
        

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        System.out.println(set.toString());

        int maxLength = 0;
        for(Integer num : set){
            if(!set.contains(num-1)){
                int length = 1;
                while(set.contains(num+length)){
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
