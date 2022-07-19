class DetectSquares {
    
    List<int[]> l;
    int[][] dp = new int[1001][1001];
    
    public DetectSquares() {
        l = new ArrayList<int[]>();
    }
    
    public void add(int[] point) {
        dp[point[0]][point[1]]++;
        l.add(point);
    }
    
    public int count(int[] point) {
        int x1 = point[0], y1 = point[1], count = 0;
        for(int[] p : l){
            int x3 = p[0], y3 = p[1];
            if( (x1 - x3) == 0 || Math.abs(x1-x3) != Math.abs(y1-y3) )
                continue;
            count += dp[x1][y3] * dp[x3][y1];
        }
        return count;
    }
}

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */