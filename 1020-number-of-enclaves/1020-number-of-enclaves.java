class Solution {
    
    public void clean(int[][] grid, int r, int c, int rmax, int cmax) {
        int[] row = grid[r];
        if(row[c] == 1) {
            row[c] = 0;            
            if(r > 0) clean(grid, r - 1, c, rmax, cmax);
            if(r < rmax) clean(grid, r + 1, c, rmax, cmax);
            if(c > 0) clean(grid, r, c - 1, rmax, cmax);
            if(c < cmax) clean(grid, r, c + 1, rmax, cmax);
        }        
    }        
    
    public int numEnclaves(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int rmax = rows - 1;
        int cmax = cols - 1;
        
        for(int r = 0; r < rows; r++) {
            clean(grid, r, 0, rmax, cmax);
            clean(grid, r, cmax, rmax, cmax);
        }
        
        for(int c = 0; c < cols; c++) {
            clean(grid, 0, c, rmax, cmax);
            clean(grid, rmax, c, rmax, cmax);
        }
                        
        int count = 0;
        for(int r = 1, rlen = rows - 1; r < rlen; r++) {
            int[] row = grid[r];
            for(int c = 1, clen = cols - 1; c < clen; c++) {
                count+=row[c];
            }
        }
        return count;
    }
}
// class Solution {
// 	public int numEnclaves(int[][] grid) {
// 		for (int i = 0; i < grid.length; i++) {
// 			for (int j = 0; j < grid[i].length; j++) {
// 				if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[i].length - 1) {
// 					if (grid[i][j] == 1)
// 						bfs(i, j, grid);
// 				}
// 			}
// 		}
// 		int count = 0;
// 		for (int i = 0; i < grid.length; i++) {
// 			for (int j = 0; j < grid[i].length; j++) {
// 				if (grid[i][j] == 1)
// 					count++;
// 			}
// 		}
// 		return count;

// 	}

// 	public static void bfs(int ni, int nj, int[][] grid) {
// 		int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
// 		Queue<int[]> q = new LinkedList<>();
// 		q.add(new int[] { ni, nj });
// 		boolean[][] visited = new boolean[grid.length][grid[0].length];
// 		while (!q.isEmpty()) {
// 			int[] r = q.poll();
// 			grid[r[0]][r[1]] = 0;
// 			if (visited[r[0]][r[1]])
// 				continue;
// 			visited[r[0]][r[1]] = true;
// 			for (int d = 0; d < 4; d++) {
// 				int i = r[0] + dirs[d][0];
// 				int j = r[1] + dirs[d][1];
// 				if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == 1 && !visited[i][j]) {
// 					q.add(new int[] { i, j });
// 				}
// 			}
// 		}
// 	}
// }