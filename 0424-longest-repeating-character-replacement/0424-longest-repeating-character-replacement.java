class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int count=0;
        int l=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            arr[ (s.charAt(r)-'A')] +=1;
            count = Math.max(count,arr[s.charAt(r)-'A']);
            while((r-l+1) - count>k){
                arr[(s.charAt(l)-'A')]-=1;
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}