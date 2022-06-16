class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        int[] bc = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5};
        List<String> ans = new LinkedList<>();
        for(int i = 0; i < 12; i++)
            for(int j = 0; j < 60; j++)
                if(bc[i] + bc[j] == turnedOn)
                    ans.add(Integer.toString(i) + ":" + (j >= 10 ? Integer.toString(j) : ("0" + Integer.toString(j))));
        return ans;
    }
}