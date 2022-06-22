class Solution {
    public Set<List<Integer>> ans = new HashSet<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        rec(k, n, 0, new boolean[10], new ArrayList<Integer>(), 1);
        return new ArrayList<>(ans);
    }
    public void rec(int k, int target, int sum, boolean[] check, List<Integer> temp, int start){
        if(k < 0)
            return;
        if(k == 0 && sum == target){
            Collections.sort(temp);
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i < 10; i++){
            temp.add(i);
            rec(k-1, target, sum + i, check, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}