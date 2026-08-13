class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        System.out.println(map);
        for(int i=0;i<nums.length;i++){
            int tarNum = target-nums[i];
            if(map.containsKey(tarNum) && i!= map.get(tarNum)){
                arr[0] = Math.min(i,map.get(tarNum));
                arr[1] = Math.max(i,map.get(tarNum));
                return arr;
            }
        }
        return null;
    }
}
