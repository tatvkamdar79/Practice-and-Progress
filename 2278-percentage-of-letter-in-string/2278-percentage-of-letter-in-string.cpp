class Solution {
public:
    int percentageLetter(string s, char letter) {
        int n = s.size();
        int count = 0;
        for(char ch : s) {
            count += (ch == letter);
        }
        
        return (count * 100) / n;
    }
};