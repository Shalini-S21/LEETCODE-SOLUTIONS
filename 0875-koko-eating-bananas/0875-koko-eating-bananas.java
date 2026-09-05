class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int l=1;
        int r=piles[0];
        for(int num:piles)
        {
            if(r<num)
            {
                r=num;
            }
        }
        int ans=0;
        while(l<r)
        {
            int mid=l+((r-l)>>1);
            if(check(piles,mid,h))
            {
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean check(int[] piles,int m,int h)
    {
        long total=0;
        for(int num:piles)
        {
            total=total+(num+m-1)/m;
        }
        return total<=h;
    }
}