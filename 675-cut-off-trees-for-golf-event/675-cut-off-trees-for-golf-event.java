class Solution {
    public int[][] dirs = {{1, 0},{-1, 0},{0, 1},{0, -1}};
    public int cutOffTree(List<List<Integer>> forest) {
        int[][] grid = new int[forest.size()][forest.get(0).size()];
        List<Integer> trees = new ArrayList<>();
        for(int i = 0; i < forest.size(); i++)
            for(int j = 0; j < forest.get(i).size(); j++){
                grid[i][j] = forest.get(i).get(j);
                if(forest.get(i).get(j) > 1)
                    trees.add(forest.get(i).get(j));
            }
        Collections.sort(trees);
        int i = 0, ans = 0;
        if(trees.get(0) == grid[0][0])
            i++;
        
        int[] start = new int[2];
        for(; i < trees.size(); i++){
            int target = trees.get(i);
            int[] res = helper(start, grid, target);
            if(res[0] == -1)
                return -1;
            ans += res[0];
            start[0] = res[1];
            start[1] = res[2];
        }
        return ans;
    }
    public int[] helper(int[] start, int[][] grid, int target){
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[start[0]][start[1]] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(start);
        int steps = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int[] temp = q.poll();
                for(int[] dir : dirs){
                    int x = temp[0] + dir[0];
                    int y = temp[1] + dir[1];
                    if(x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && !visited[x][y] && grid[x][y] != 0){
                        if(grid[x][y] == target)
                            return new int[]{steps+1, x, y};
                        else{
                            q.add(new int[]{x, y});
                            visited[x][y] = true;
                        }
                    }
                }
            }
            steps++;
        }
        return new int[]{-1, 0, 0};
    }
}