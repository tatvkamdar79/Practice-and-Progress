class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] b = new int[1001];
        for(int[] i : nums)
            for(int j : i)
                b[j]++;
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < 1001; i++){
            if(b[i] == nums.length){
                l.add(i);
            }
        }
        return l;
    }
}