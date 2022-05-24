class Solution {
    public String digitSum(String s, int k) {
        int n = s.length();
        
        if (n <= k)
            return s;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ) {
            int curr = 0;
            for (int j = 0; j < k && (i+j) < n; j++) {
                curr += Integer.valueOf(s.charAt(i+j) - '0');
            }
            sb.append(String.valueOf(curr));
            i += k;
        }
       // System.out.println(sb.toString());
        return digitSum(sb.toString(), k);
    }
}