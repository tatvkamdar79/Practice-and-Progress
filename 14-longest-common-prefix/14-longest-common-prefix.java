class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length== 0) {
            return "";
        }
        String pre = strs[0]; // first word
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) { // appear at front
                pre = pre.substring(0, pre.length() - 1); //move the ending fwrd
                if (pre.isEmpty()) {
                    return "";
                }
            }
        }
        
        return pre;
    }
}