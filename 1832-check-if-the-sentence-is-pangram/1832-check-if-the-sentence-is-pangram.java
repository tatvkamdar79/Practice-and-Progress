class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] f = new int[26];
        for(char c : sentence.toCharArray())
            ++f[c-'a'];
        for(int i = 0; i < 26; i++)
            if(f[i] == 0)
                return false;
        return true;
    }
}