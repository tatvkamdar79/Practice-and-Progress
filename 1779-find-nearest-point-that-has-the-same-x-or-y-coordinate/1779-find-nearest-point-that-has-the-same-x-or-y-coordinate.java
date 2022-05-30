class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int dist = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i < points.length; i++){
            int[] arr = points[i];
            if(arr[0] == x || arr[1] == y){
                int curr = Math.abs(x - arr[0]) + Math.abs(y - arr[1]);
                if(curr < dist){
                    dist = curr;
                    ans = i;
                }
            }
        }
        return dist == Integer.MAX_VALUE ? -1 : ans;
    }
}