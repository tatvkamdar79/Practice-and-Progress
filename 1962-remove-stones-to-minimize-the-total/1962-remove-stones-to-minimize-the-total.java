class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int num: piles)
            pq.add(num);
        for (int i = 0; i < k; i++) {
            int curr = pq.remove();
            int remove = curr / 2;
            pq.add(curr - remove);
        }
        int ans = 0;
        for (int num: pq)
            ans += num;
        return ans;
    }
}