class Solution {
    public int trap(int[] height) {
        int area = 0, l = height[0];
        for(int i = 0; i < height.length; i++){
            int r = 0;
            l = Math.max(l, height[i]);
            for(int j = i + 1; j < height.length; j++){
                r = Math.max(r, height[j]);
            }
            
            if(l > height[i] && r > height[i]){
                // System.out.println(7);
                area += Math.abs(Math.min(l,r) - height[i]);
            }
        }
        return area;
    }
}