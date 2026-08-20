class Solution {
    public int characterReplacement(String s, int k) {
       int[] arr = new int[26];
       int i=0;
       int count=0;
       int maxlen=0;
       for(int j=0;j<s.length();j++){
            arr[s.charAt(j)-'A']+=1;
            count = Math.max(count,arr[s.charAt(j)-'A']);
            while((j-i+1)-count>k){
                arr[s.charAt(i)-'A']-=1;
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
       }
      return maxlen;
    }
}
// class Solution {
//     public int characterReplacement(String s, int k) {
//        char[] ch = s.toCharArray();
//        int i=0;
//        int j=1;
//        int temp=k;
//        int ans = 0;
//        while(j<s.length() && i<s.length()){
//         if(ch[i]==ch[j])
//         j++;
//         else if(ch[i]!=ch[j] && k!=0)
//             {
//                 k--;
//                 j++;
//             }
//             else {
//                 k=temp;
//                 i=j;
//             }
//         ans = Math.max(ans,j-i);
//        }
//        return ans;
//     }
// }