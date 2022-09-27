class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mp.putIfAbsent(i+j, new ArrayList<>());
                mp.get(i+j).add(mat[i][j]);
            }
        }
        int c = 0;
        int[] ans = new int[m*n];
        for(int i : mp.keySet()){
            if(i % 2 == 0)
                Collections.reverse(mp.get(i));
            for(int j : mp.get(i))
                ans[c++] = j;
        }
        return ans;
    }
}