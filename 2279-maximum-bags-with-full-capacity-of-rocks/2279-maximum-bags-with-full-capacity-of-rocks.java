class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] need = new int[rocks.length];
        for(int i = 0; i < rocks.length; i++)   need[i] = capacity[i] - rocks[i];
        Arrays.sort(need);
        int count = 0;
        for(int i = 0; i < need.length && (need[i]-additionalRocks <= 0); i++){
            additionalRocks -= need[i];
            count++;
        }
        return count;
    }
}