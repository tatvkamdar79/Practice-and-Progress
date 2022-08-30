class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(char c : s.toCharArray()){
            if(c == '*')
                st.pop();
            else
                st.push(c);
        }
        while(!st.empty())
            ans += st.pop();
        return new StringBuilder(ans).reverse().toString();
    }
}