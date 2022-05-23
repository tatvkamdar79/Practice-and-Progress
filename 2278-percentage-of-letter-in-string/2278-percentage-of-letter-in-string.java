class Solution {
    public int percentageLetter(String s, char letter) {
        double count = 0;
        
        for (char c : s.toCharArray())
            if (c == letter) count += 100;
        
        return (int)Math.floor(count / s.length());
    }
}