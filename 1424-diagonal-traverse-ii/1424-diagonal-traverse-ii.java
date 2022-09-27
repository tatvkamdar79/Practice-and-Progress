class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, List<Integer>> mp = new TreeMap<>();
        int c = 0;
        for(int i = nums.size() - 1; i >= 0; i--){
            c += nums.get(i).size();
            for(int j = nums.get(i).size() - 1; j >= 0 ; j--){
                mp.putIfAbsent(i+j, new LinkedList<>());
                mp.get(i+j).add(nums.get(i).get(j));
            }
        }
        int[] ans = new int[c];
        int idx = 0;
        for(int i : mp.keySet())
            for(int j : mp.get(i))
                ans[idx++] = j;
        return ans;
    }
}