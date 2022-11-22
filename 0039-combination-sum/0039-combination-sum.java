class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        rec(candidates, target, 0, 0, new ArrayList<>());
        return ans;
    }
    public void rec(int[] cand, int target, int curr, int idx, List<Integer> temp){
        if(curr == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i < cand.length; i++){
            if(curr + cand[i] <= target){
                temp.add(cand[i]);
                rec(cand, target, curr+cand[i], i, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}