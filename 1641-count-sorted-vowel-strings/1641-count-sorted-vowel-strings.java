class Solution {
    public int countVowelStrings(int n) {
        // return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24;
        int a = 1, e = 1, i = 1, o = 1;
        for(int j = 2; j <= n; j++){
            a = a + e + i + o + 1;
            e = e + i + o + 1;
            i = i + o + 1;
            o = o + 1;
            // u = u;
        }
        return a + e + i + o + 1;
    }
}