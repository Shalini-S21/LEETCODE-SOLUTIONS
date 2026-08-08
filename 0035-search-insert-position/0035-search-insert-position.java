class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1,mid=0;
        while(l<=h){
             mid=l+(h-l)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target)
            l=mid+1;
            else
            h=mid-1; 
        }
  return l;  }
}