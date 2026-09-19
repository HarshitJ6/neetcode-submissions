class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int i=0,j=heights.length-1;
        while(i<j){
            int area;
            if(heights[i] < heights[j]){
                area = heights[i] * (j-i);
                i++;
            }else{
                area = heights[j] * (j-i);
                j--;
            }
            max = Math.max(max,area);
        }
        return max;
    }
}
