class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];

        for (int i : nums) {
            int index = Math.abs(i) - 1;

            if (nums[index] < 0) {
                res[0] = Math.abs(i);
            } else {
                nums[index] *= -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res[1] = i + 1;
            }
        }

        return res;
    }
}