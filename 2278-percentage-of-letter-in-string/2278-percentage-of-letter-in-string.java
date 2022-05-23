class Solution {
    public int percentageLetter(String s, char letter) {
        return (int)(((double)s.chars().filter(ch -> ch == letter).count() / (double)s.length()) * 100);
    }
}