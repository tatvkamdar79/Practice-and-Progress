class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max = Integer.MIN_VALUE, idx = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int c = 0;
        int[] ans = new int[nums.length - k + 1];
        for(int i = 0; i < nums.length; i++){
            pq.add(new int[]{nums[i], i});
            if(i + 1 >= k){
                ans[c++] = pq.peek()[0];
            }
            while(pq.size() > 0 && i - pq.peek()[1] + 1 >= k)
                pq.poll();
        }
        return ans;
    }
}