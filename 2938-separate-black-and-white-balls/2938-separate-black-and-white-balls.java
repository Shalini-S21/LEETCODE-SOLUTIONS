class Solution {
    public long minimumSteps(String s) {
        int i=0;
        int j=s.length()-1;
        long count=0;
        char[] ch = s.toCharArray();
        while(i<j){
            if(ch[i]=='1' && ch[j]=='0'){
               count+=j-i;
               i++;
               j--;
            }
           else if(ch[i]=='0') i++;
           else j--;
        }
        return count;
    }
}