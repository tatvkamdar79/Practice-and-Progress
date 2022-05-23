class Solution {
    public int[][] floodFill(int[][] img, int sr, int sc, int newColor) {
        Queue<List<Integer>> q = new LinkedList<>();
        Set<List<Integer>> s = new HashSet<>();
        
        q.add(Arrays.asList(sr,sc));
        s.add(Arrays.asList(sr,sc));
        
        int r_bound = img.length, c_bound = img[0].length, startPixel = img[sr][sc];
        
        img[sr][sc] = newColor;
        
        while(!q.isEmpty()){
            List<Integer> l = q.remove();
            
            int r = l.get(0), c = l.get(1);
            
            if(r+1 < r_bound && s.add(Arrays.asList(r+1,c)) && img[r+1][c] == startPixel){
                q.add(Arrays.asList(r+1,c));
                img[r+1][c] = newColor;
            }
            if(r-1 >= 0 && s.add(Arrays.asList(r-1,c)) && img[r-1][c] ==  startPixel){
                q.add(Arrays.asList(r-1,c));
                img[r-1][c] = newColor;
            }
            if(c+1 < c_bound && s.add(Arrays.asList(r,c+1)) && img[r][c+1] == startPixel){
                q.add(Arrays.asList(r,c+1));
                img[r][c+1] = newColor;
            }
            if(c-1 >= 0 && s.add(Arrays.asList(r,c-1)) && img[r][c-1] == startPixel){
                q.add(Arrays.asList(r,c-1));
                img[r][c-1] = newColor;
            }
        }
        return img;
    }
}