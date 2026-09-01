class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        subsets(nums, ans, sub, 0);
        return ans;
    }

    public void subsets(int[] nums, List<List<Integer>> ans, List<Integer> sub,
            int index) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[index]);
        subsets(nums, ans, sub, index + 1);
        sub.remove(sub.size() - 1);
        subsets(nums, ans, sub, index + 1);

    }
}