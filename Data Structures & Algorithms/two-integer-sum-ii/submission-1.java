class Solution {
    public int[] twoSum(int[] num, int target) {
        int i=0;
        int j=num.length-1;

        while(i<j){
            int sum = num[i] + num[j];
            if(sum == target){
                int[] arr = new int[2];
                arr[0] = i+1;
                arr[1] = j+1;
                return arr;
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[2];
    }
}
