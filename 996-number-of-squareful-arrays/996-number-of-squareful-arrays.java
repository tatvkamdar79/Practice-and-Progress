class Solution {
    public int ans = 0;
    public int numSquarefulPerms(int[] nums) {
        Arrays.sort(nums);
        dfs(nums, 0, -1);
        return ans;
    }
    public void dfs(int[] nums, int cnt, int prev){
        if(cnt == nums.length){
            ans++;
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == -1)   continue;
            
            if(i > 0 && nums[i] == nums[i-1])   continue;
            
            int root = (int)Math.sqrt(nums[i]+prev);
            if(prev != -1 && root * root != nums[i] + prev) continue;
            
            int tmp = nums[i];
            nums[i] = -1;
            dfs(nums, cnt + 1, tmp);
            nums[i] = tmp;
        }
    }
}