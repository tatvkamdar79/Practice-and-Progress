class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)    return strs[0];
        
        Arrays.sort(strs);
        
        char[] a = strs[0].toCharArray();
        char[] b = strs[strs.length - 1].toCharArray();
        
        String res = "";
        
        for(int i = 0; i < Math.min(a.length, b.length); i++){
            if(a[i] == b[i])
                res += a[i];
            else
                return res;
        }
        
        return res;
    }
}