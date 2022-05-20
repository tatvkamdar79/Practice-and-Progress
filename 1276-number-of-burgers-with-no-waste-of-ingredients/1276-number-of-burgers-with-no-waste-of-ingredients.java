class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if((tomatoSlices&1) == 1)  return Collections.emptyList();
        
        int jumbo = ( tomatoSlices - 2 * (cheeseSlices) ) / 2;
        int small = cheeseSlices - jumbo;
        
        return (jumbo >= 0 && small >= 0) ? Arrays.asList(jumbo, small) : Collections.emptyList();
    }
}