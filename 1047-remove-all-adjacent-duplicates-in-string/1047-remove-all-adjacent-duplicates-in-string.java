class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()==ch[i])
            st.pop();
            else
            st.push(ch[i]);
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}