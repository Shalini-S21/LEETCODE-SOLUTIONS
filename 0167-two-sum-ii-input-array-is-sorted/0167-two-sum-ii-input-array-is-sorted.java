class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] soln = new int[2];
        while(i<j){
            if(numbers[i]+numbers[j] == target)
            {
                soln[0]=i+1;
                soln[1]=j+1;
                return soln;
            }
            else if(numbers[i]+numbers[j] > target)
            j--;
            else
                i++;
        }
        return soln;
    }
}