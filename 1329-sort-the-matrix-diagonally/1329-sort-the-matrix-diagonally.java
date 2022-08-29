class Solution {
    public int[][] diagonalSort(int[][] mat) {
        Map<Integer, PriorityQueue<Integer>> mp = new HashMap<>();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mp.containsKey(i-j))
                    mp.get(i-j).add(mat[i][j]);
                else{
                    mp.put(i-j, new PriorityQueue<Integer>());
                    mp.get(i-j).add(mat[i][j]);
                }
            }
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = mp.get(i-j).poll();
            }
        }
        return mat;
    }
}