class Solution {
    public int missingNumber(int[] nums) {
        int res = IntStream.rangeClosed(1, nums.length).reduce(0,(a,b)-> a^b);
        res = Arrays.stream(nums).reduce(res,(a,b)-> a^b);
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        int exp = (n*(n+1))/2;

        return exp-sum;
    }
}
