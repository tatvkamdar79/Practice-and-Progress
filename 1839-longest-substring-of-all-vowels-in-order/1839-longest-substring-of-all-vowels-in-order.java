class Solution {
    public int longestBeautifulSubstring(String word) {
        boolean a = false, e = false, i = false, o = false, u = false;
        int ans = 0, idx = 0;
        
        while(idx < word.length()){
            int start = idx;
            while(idx < word.length() && word.charAt(idx) == 'a'){
                idx++;
                a = true;
            }
            while(idx < word.length() && a && word.charAt(idx) == 'e'){
                idx++;
                e = true;
            }
            while(idx < word.length() && e && word.charAt(idx) == 'i'){
                idx++;
                i = true;
            }
            while(idx < word.length() && i && word.charAt(idx) == 'o'){
                idx++;
                o = true;
            }
            while(idx < word.length() && o && word.charAt(idx) == 'u'){
                idx++;
                u = true;
            }
            if(u){
                ans = Math.max(ans, idx-start);
            }
            a = e = i = o = u = false;
            if(start == idx)
                idx++;
        }
        return ans;
    }
}