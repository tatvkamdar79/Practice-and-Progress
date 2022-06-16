class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new LinkedList<>();
        for(int i = 0; i < 12; i++)
            for(int j = 0; j < 60; j++)
                if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn)
                    ans.add(Integer.toString(i) + ":" + (j >= 10 ? Integer.toString(j) : ("0" + Integer.toString(j))));
        return ans;
    }
}