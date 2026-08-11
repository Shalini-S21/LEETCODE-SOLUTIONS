class Solution {
    public int missingInteger(int[] nums) {
        int j=1;
        int n=nums.length-1;
        int count=nums[0];
        boolean flag = true;
        while(flag && j<n+1){
            if(nums[j]==nums[j-1]+1)
                count+=nums[j];
            else 
            flag = false;
            j++;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
            set.add(num);
        while(set.contains(count))
            count++;
        return count;
    }
}