class Solution {
    public int reachNumber(int target) {
        int steps = 1;
        int soFar = 0;
        target = Math.abs(target);
        while(soFar < target){
            soFar += steps++;
        }
        if(soFar == target) return steps-1;
        int diff = soFar - target;
        while((soFar - target) % 2 != 0){
            soFar += steps++;
        }
        return steps-1;
    }
}