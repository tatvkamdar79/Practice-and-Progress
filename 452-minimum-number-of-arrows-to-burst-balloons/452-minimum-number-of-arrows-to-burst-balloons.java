class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.parallelSort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int end = points[0][1];
        int arrow = 1;
        for(int i = 1; i < points.length; i++){
            if(points[i][0] > end){
                end = points[i][1];
                arrow++;
            }
        }
        return arrow;
    }
}