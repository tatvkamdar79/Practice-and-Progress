class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        // String ans = "";
        for(char c : s.toCharArray()){
            if(c == '*')
                st.pop();
            else
                st.push(c);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.empty())
            ans.append(st.pop());
        return ans.reverse().toString();
    }
}