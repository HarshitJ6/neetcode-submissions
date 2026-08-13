class Solution {
    public boolean isHappy(int n) {
        int currNum = n;
        Set<Integer> set = new HashSet<>();
        while(true){
            int sum = 0;
            while(currNum > 0){
                int ls = currNum%10;
                currNum = currNum/10;
                sum += ls*ls;
            }
            if(sum == 1){
                return true;
            }else{
                if(set.contains(sum)){
                    return false;
                }
                set.add(sum);
                currNum = sum;
            }
        }
    }
}
