class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if((i==0) && (s.charAt(i)=='0'))
                continue;
            else if((i==0) && ((s.charAt(i)=='+') || (s.charAt(i)=='-')))
                sb.append(s.charAt(i));
            else{
                if(Character.isDigit(s.charAt(i)))
                    sb.append(s.charAt(i));
                else
                    break;
            }
        }

        if(sb.length()!=0){
            long ans=0;
            int sign=1;
            int i=0;

            if(sb.charAt(0)=='-' || sb.charAt(0)=='+'){
                if(sb.charAt(0)=='-')
                    sign=-1;
                i++;
            }

            while(i<sb.length()){
                ans=ans*10+(sb.charAt(i)-'0');

                if(sign==1 && ans>Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;

                if(sign==-1 && -ans<Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;

                i++;
            }

            return (int)(ans*sign);
        }
        else
            return 0;
    }
}