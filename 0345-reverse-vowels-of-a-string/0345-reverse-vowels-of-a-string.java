class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l=0,r=arr.length-1;
        while(l<r){
            while(l<r && !isVowel(arr[l])) l++;
            while(l<r && !isVowel(arr[r])) r--;
            char t= arr[l];
            arr[l++]=arr[r];
            arr[r--]=t;
        }
        return new String(arr);
    }
    boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}