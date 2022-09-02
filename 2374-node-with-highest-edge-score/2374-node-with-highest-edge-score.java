class Solution {
    public int edgeScore(int[] edges) {
        double[] mp = new double[edges.length];
        for(int i = 0; i < edges.length; i++){
            mp[edges[i]] += (double)i;
        }
        double max = 0, edge = 0;
        for(int i = 0; i < mp.length; i++){
            if(mp[i] > max){
                max = mp[i];
                edge = i;
            }
        }
        return (int)edge;
    }
}