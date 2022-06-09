class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K){
        int[] cost=new int[n];
        Arrays.fill(cost,Integer.MAX_VALUE);
        cost[src]=0;
        for(int i=0;i<=K;i++)
        {
            int[] temp= Arrays.copyOf(cost,n);
            for(int[] f: flights)
            {
                int curr=f[0],next=f[1],price=f[2];
                if(cost[curr]==Integer.MAX_VALUE)
                    continue;
                temp[next]=Math.min(temp[next],cost[curr]+price);
            }
            cost=temp;
        }
        return cost[dst]==Integer.MAX_VALUE?-1:cost[dst];
    }
}
// class Solution {
//     int cost = Integer.MAX_VALUE;
//     public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
//         Map<Integer, Set<int[]>> mp = new HashMap<>();
        
//         for(int i = 0; i < flights.length; i++){
            
//             int[] temp = new int[]{flights[i][1], flights[i][2]};
            
//             if(mp.containsKey(flights[i][0]))
//                 mp.get(flights[i][0]).add(temp);
            
//             else
//                 mp.put(flights[i][0], new HashSet<int[]>());
//                 mp.get(flights[i][0]).add(temp);
//         }
//         // System.out.println(mp);
//         // for(int i : mp.keySet()){
//         //     System.out.print(i + " -> ");
//         //     for(int[] j : mp.get(i))
//         //         System.out.print(Arrays.toString(j) + ", ");
//         //     System.out.println();
//         // }
//         Set<Integer> vis = new HashSet<>();
//         rec(flights, src, dst, 0, k+1, vis, mp);
        
//         return cost == Integer.MAX_VALUE ? -1 : cost;
//     }
//     public void rec(int[][] flights, int curr_src, int dst, int curr_cost, int stops, Set<Integer> vis, Map<Integer, Set<int[]>> mp){
//         if(stops == 0){
//             if(curr_src == dst){
//                 cost = Math.min(cost, curr_cost);
//                 return;
//             }
//             else
//                 return;
//         }
//         if(stops < 0){
//             return;
//         }
//         if(vis.contains(curr_src))
//             return;
//         if(curr_src == dst){
//             cost = Math.min(cost, curr_cost);
//         }
        
//         if(!mp.containsKey(curr_src))
//             return;
        
//         vis.add(curr_src);
        
//         Set<int[]> possible = mp.get(curr_src);
//         // System.out.println(possible);
//         for(int[] i : possible){
//             rec(flights, i[0], dst, curr_cost + i[1], stops - 1, vis, mp);
//         }
//         vis.remove(curr_src);
//     }
// }