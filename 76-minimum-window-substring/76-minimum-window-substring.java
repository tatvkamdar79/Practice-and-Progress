class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[123];
        int miss = t.length();
        char[] have = s.toCharArray();
        for(char c : t.toCharArray()) need[c]++;
        int i = 0, j = 0, l = 0, r = 0;
        
        while(r < s.length()){
            if(need[have[r]] > 0) miss--;
            need[have[r]]--;
            r++;
            
            while(miss == 0){
                if(j == 0 || (r-l) < (j-i)){
                    j = r;
                    i = l;
                } 
                need[have[l]]++;
                if(need[have[l]] > 0)miss++;
                l++;
            }
        }
        return s.substring(i,j);
    }
}