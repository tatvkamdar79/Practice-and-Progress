class Solution {
    int k, n;
    List<String> l = new LinkedList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        this.k = k;
        this.n = n;
        String s = "";
        for(char c = '1'; c <= '9'; c++){
            rec(s+c);
        }
        // System.out.println(l);
        int[] ans = new int[l.size()];
        for(int i = 0; i < l.size(); i++)
            ans[i] = Integer.valueOf(l.get(i));
        return ans;
    }
    public void rec(String s){
        if(s.length() == n){
            l.add(s);
        }
        else{
            for(char c = '0'; c <= '9'; c++){
                char x = s.charAt(s.length() - 1);
                int diff = ((x - '0') - (c - '0'));
                if(diff == k || diff == -k){
                    rec(s+c);
                }
            }
        }
    }
}