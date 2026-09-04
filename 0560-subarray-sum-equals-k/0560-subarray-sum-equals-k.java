class Solution {
    public int subarraySum(int[] nums, int k) {
       int [] pref=new int[nums.length];
            pref[0]=nums[0];
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=1;i<nums.length;i++){
            pref[i]=nums[i]+pref[i-1];
        }
        mp.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=pref[i]-k;
            if(mp.containsKey(sum)){
                  count+=mp.get(sum);
            }
            mp.put(pref[i],mp.getOrDefault(pref[i],0)+1);
        }
        return count;
    }
}