class Solution {
    public int reachNumber(int target) {
        // int steps = 1;
        // int soFar = 0;
        // target = Math.abs(target);
        // while(soFar < target){
        //     soFar += steps++;
        // }
        // if(soFar == target) return steps-1;
        // int diff = soFar - target;
        // while((soFar - target) % 2 != 0){
        //     soFar += steps++;
        // }
        // return steps-1;

        target = Math.abs(target);
        int n = (int)Math.ceil((-1 + Math.sqrt(1 + 8.0*(target))) / 2);
        int sum = (n * (n+1)) / 2;
        if(sum == target)   return n;
        int rem = sum - target;
        if((rem&1) == 0)    return n;
        if((n & 1) == 1) return n + 2;
        return n + 1;
        // return n + (int)((n & 1) ? 2 : 1);
    }
}