class Solution {
    public int maxArea(int[] height) {
        int l =0 , r = height.length -1, h=0 , w=0,maxArea=0;

        while(l<r){
            h = Math.min(height[l],height[r]);
            w = (r -l);
            maxArea = Math.max(maxArea,h * w);

            if(height[l] < height[r]){
                l++;
            }else {
                r--;
            }

        }
        return maxArea;
    }
}