class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int area = 0;
        while(i<j){
           int h=Math.min(height[j],height[i]);
           int w=j-i;
            area=Math.max(area,h*w);
            if(height[i]>height[j])
            j--;
            else i++;
        }
        return area;
    }
}