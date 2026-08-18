class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = heights.length;
        int[] arr = new int[n];

        for(int i=n-1;i>=0;i--) {
            int count = 0;

            while(!dq.isEmpty() &&dq.peek()< heights[i]) {
                dq.pop();
                count++;
            }

            if(!dq.isEmpty())
                count++;

            arr[i] = count;

            dq.push(heights[i]);
        }

        return arr;
    }
}