class Solution {
    public String convert(String s, int n) {
        if(n == 1)  return s;
        int step = (n-1) + (n-2);
        int i = 0;
        String res = "";
        while(i < s.length()){
            res += s.substring(i,i+1);
            i += step + 1;
        }
        i = 0;
        int c = 0;
        while(c < (step + 1)/2){
            if(i+1+c < s.length())  res += s.charAt(i+1+c);
            if(i+step-c < s.length() && i+step-c != i+1+c)   res += s.charAt(i+step-c);
            i += step + 1;
            if(i >= s.length()){
                i = 0;
                c += 1;
                // System.out.println(res);
            }
        }
        return res;
        
    }
}