class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for(int i : position)
            if(i % 2 == 0)
                even++;
        odd = position.length - even;
        return Math.min(odd, even);
    }
}