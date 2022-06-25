class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i = 0; i <= n; i++){
            int c = 0;
            int temp = i;
            while(temp != 0){
                c += (temp & 1) == 1 ? 1 : 0;
                temp = temp>>>1;
            }
            ans[i] = c;
        }
        return ans;
    }
}