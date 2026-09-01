class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        makeComb(candidates, target, 0, comb, 0, ans);
        return ans;
    }
    public void makeComb(int[] candidates, int target, int total, List<Integer> comb, int index, List<List<Integer>> ans){
        if(total==target){
            ans.add(new ArrayList<> (comb));
            return;
        }
        if(total>target || index>=candidates.length){
            return;
        }
        comb.add(candidates[index]);
        makeComb(candidates, target, total+candidates[index], comb, index, ans);
        comb.remove(comb.size()-1);
        makeComb(candidates, target, total, comb, index+1, ans);
    }
}