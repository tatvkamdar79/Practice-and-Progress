class Solution {
    public int nearestExit(char[][] maze, int[] ent) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{ent[0], ent[1], 0});
        int m = maze.length, n = maze[0].length;
        int steps = 0;
        int[][]dir = new int[][]{{1,0},{0, 1}, {-1, 0}, {0, -1}};
        while(!q.isEmpty()){
            int[] ar = q.poll();
            
            if(ar[0] != ent[0] || ar[1] != ent[1]){
                if(ar[0] == 0 || ar[0] == m - 1 || ar[1] == 0 || ar[1] == n - 1)
                    return ar[2];                
            }
            //add neighbours to queue
            for(int[] d: dir){
                int i = d[0] + ar[0], j = d[1] + ar[1];
                if(i >= 0 && j >=0 && i < m && j < n && maze[i][j] == '.'){
                    q.add(new int[]{i, j, ar[2] + 1});
                    maze[i][j] = '+';
                }
            }
            
        }
        return -1;
    }
}