class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int n = gas.length;
        int total_excess = 0;
        int excess = 0;
        for(int i = 0; i < n; i++){
            total_excess += gas[i] - cost[i];
            excess += gas[i] - cost[i];
            if(excess < 0){
                excess= 0;
                start = i + 1;
            }
        }
        if(total_excess < 0)
            return -1;
        return start;
    }
}