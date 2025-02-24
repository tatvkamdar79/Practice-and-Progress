class Solution {
    public int trap(int[] height) {
      int n = height.length;
      int[] l = new int[n], r = new int[n];
      int lmax = 0;
      int rmax = 0;
      for(int i = 0; i < n; i++) {
        if(lmax > height[i]) l[i] = lmax - height[i];
        lmax = Math.max(lmax, height[i]);
      }
      for(int i = n - 1; i >= 0; i--) {
        if(rmax > height[i]) r[i] = rmax - height[i];
        rmax = Math.max(rmax, height[i]);
      }
      int ans = 0;
      for(int i = 0; i < n; i++) ans += Math.min(l[i], r[i]);
      return ans;
    }
}

// max = 3
// a - 0 1 0 2 1 0 1 3 2 1 2 1
//     i
// r - 3 2 3 1 2 3 2 0 0 1 0 0 
// l - 0 0 1 0 1 2 1 0 1 2 1 2
// f - 0 0 1 0 1 2 1 0 0 1 0 0