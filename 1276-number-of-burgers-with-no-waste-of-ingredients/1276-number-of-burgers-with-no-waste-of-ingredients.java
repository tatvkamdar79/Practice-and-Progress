class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if(tomatoSlices % 2 == 1) return new ArrayList<Integer>();
        int s = -tomatoSlices/2 + 2*cheeseSlices;
        int j =  tomatoSlices/2 -   cheeseSlices;
        
        if(j < 0 || s < 0) return new ArrayList<Integer>();
        return Arrays.asList(j, s);
    }
}