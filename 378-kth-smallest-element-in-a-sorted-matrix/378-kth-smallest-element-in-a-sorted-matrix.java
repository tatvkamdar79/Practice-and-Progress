class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] arr : matrix)
            for(int num : arr)
                pq.add(num);
        while(--k > 0)
            pq.poll();
        return pq.poll();
    }
}