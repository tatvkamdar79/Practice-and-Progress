class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image==null || image.length==0 || image[sr][sc]==newColor){
            return image;
        }
        int color = image[sr][sc];
        image[sr][sc] = newColor;
        Queue<int[]> q = new LinkedList<>();
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        q.add(new int[]{sr, sc});
        while(!q.isEmpty()){
            int size = q.size();
            while(!q.isEmpty()){
                int[] curr = q.poll();
                for(int[] dir : dirs){
                    int r = dir[0] + curr[0];
                    int c = dir[1] + curr[1];
                    if(r>=0 && r<image.length && c>=0 && c<image[r].length && image[r][c] == color){
                        image[r][c] = newColor;
                        q.add(new int[]{r, c});
                    }
                }
            }
        }
        return image;
    }
    // D F S
    
    // static void dfs(int [][]image,int sr,int sc,int newColor,int row,int col,int src ){
    //     if(sr<0||sr>=row||sc<0||sc>=col){
    //         return ;
    //     }
    //     else if(image[sr][sc]!=src){
    //         return ;
    //     }
    //     image[sr][sc]=newColor;
    //     dfs(image,sr-1,sc,newColor,row,col,src);
    //     dfs(image,sr+1,sc,newColor,row,col,src);
    //     dfs(image,sr,sc-1,newColor,row,col,src);
    //     dfs(image,sr,sc+1,newColor,row,col,src);
    // }
    // public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    //     if(newColor==image[sr][sc]){
    //         return image;
    //     }
    //     int row=image.length;
    //     int col=image[0].length;
    //     int src=image[sr][sc];
    //     dfs(image,sr,sc,newColor,row,col,src);
    //  return image;   
    // }
}