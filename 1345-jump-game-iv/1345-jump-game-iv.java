class Solution {
    public int minJumps(int[] arr) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            mp.putIfAbsent(arr[i], new LinkedList<>());
            mp.get(arr[i]).add(i);
        }
        int n = arr.length, steps = 0;
        Queue<Integer> q = new LinkedList<>(); q.add(0);
        boolean[] vis = new boolean[n];
        
        while(!q.isEmpty()){
            for(int size = q.size(); size > 0; --size){
                int i = q.poll();
                if(i == n - 1)
                    return steps;
                List<Integer> l = mp.get(arr[i]);
                l.add(i + 1); l.add(i - 1);
                for(int j : l){
                    if(j == n - 1)
                        return steps + 1;
                    if(j >= 0 && j < n && !vis[j]){
                        q.offer(j);
                        vis[j] = true;
                    }
                }
                l.clear();
            }
            steps++;
        }
        return 0;
    }
}