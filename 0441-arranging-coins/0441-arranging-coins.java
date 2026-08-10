class Solution {
    public int arrangeCoins(int n) {
	      int i=0;
	      int j=1;
	     while(true) {
	        n=n-j;
	         j++;
	     if(n<0) {
	         break;
	  }
	      else i++;
	 }
      return i;
    }
}