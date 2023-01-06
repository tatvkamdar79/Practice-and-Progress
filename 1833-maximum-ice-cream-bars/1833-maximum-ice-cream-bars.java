class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        // System.out.println(Arrays.toString(costs));
        int c = 0, i = 0;
        while(i < costs.length && coins >= costs[i]){
            coins -= costs[i++];
            c++;
        }
        return c;
    }
}