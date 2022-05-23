class Solution {
public:
    int percentageLetter(string s, char letter) {
        double count = 0;
        
        for (int i = 0; i < s.size(); i++)
            if (s[i] == letter) count += 100;
        
        return (int)floor(count / s.length());
    }
};