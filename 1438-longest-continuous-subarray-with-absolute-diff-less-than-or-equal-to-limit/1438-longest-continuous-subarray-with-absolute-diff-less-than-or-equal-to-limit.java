class Solution {
    public int longestSubarray(int[] nums, int limit) {

        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();

        int l = 0;
        int ans = 0;

        for (int r = 0; r < nums.length; r++) {

            while (!max.isEmpty() && nums[max.peekLast()] < nums[r])
                max.pollLast();

            while (!min.isEmpty() && nums[min.peekLast()] > nums[r])
                min.pollLast();

            max.addLast(r);
            min.addLast(r);

            while (nums[max.peekFirst()] - nums[min.peekFirst()] > limit) {

                if (max.peekFirst() == l)
                    max.pollFirst();

                if (min.peekFirst() == l)
                    min.pollFirst();

                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}