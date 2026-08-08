class Solution {
    public static int findFirst(int[] nums,int target){
        int ans = -1;
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] >= target)
                high = mid-1;
            else
                low = mid+1;
            if(nums[mid] == target)
                ans=mid; 
        }
        return ans;
    }
     public static int findLast(int[] nums,int target){
        int ans = -1;
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] <= target)
                low = mid+1;
            else
                high = mid-1;
            if(nums[mid] == target)
                ans=mid; 
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
      int[] soln = new int[2];
      soln[0] = findFirst(nums,target);
      soln[1] = findLast(nums,target);
      return soln;
      
    }
}