class Solution {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int count = 1;
        for(int i : coins){
            if(i > count)   return count;
            count += i;
        }
        return count;
    }
}