class Solution {
    String min = "999999999999999";
    String ptrn;
    public String smallestNumber(String pattern) {
        String s = "";
        ptrn = pattern;
        boolean[] check = new boolean[10];
        if(perm(s, check))
            return min;
        return "";
    }
    public boolean perm(String s, boolean[] check){
        if(s.length() == ptrn.length() + 1){
            if(satisfy(s)){
                min = s;
                return true;
            }
        }
        else{
            for(char c = '1'; c <= '9'; c++){
                if(!check[c-'1']){
                    check[c-'1'] = true;
                    if(perm(s + c, check))
                        return true;
                    check[c-'1'] = false;
                }
            }
        }
        return false;
    }
    public boolean satisfy(String s){
        for(int i = 0; i < ptrn.length(); i++){
            if(ptrn.charAt(i) == 'I' && s.charAt(i+1) < s.charAt(i))
                return false;
            if(ptrn.charAt(i) == 'D' && s.charAt(i+1) > s.charAt(i))
                return false;
        }
        return true;
    }
}