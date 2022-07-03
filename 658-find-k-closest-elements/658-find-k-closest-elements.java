class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> {
                if(Math.abs(a-x) == Math.abs(b-x)){
                    return b-a;
                }else{
                    return Math.abs((b-x) * (b-x)) - Math.abs((a-x) * (a-x));
                }
            }
        );
        
        for(int i : arr){
            pq.add(i);
            if(pq.size() > k){
                pq.poll();
            }  
        }
        
        List<Integer> ret = new ArrayList(pq);
        Collections.sort(ret);
        return ret;
    }
}