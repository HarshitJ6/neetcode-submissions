class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> unique = Arrays.stream(nums)
        .boxed()
        .distinct()
        .toList();

        return nums.length != unique.size() ? true : false;
    }
}