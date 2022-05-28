class Solution {
    public int findDuplicate(int[] nums) {
        boolean visited[] = new boolean[nums.length];
        int i=0;
        while(!visited[nums[i]]){
            visited[nums[i]] = true;
            i++;
        }
        return nums[i];
    }
}