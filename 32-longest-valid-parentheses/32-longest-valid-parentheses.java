class Solution {
    public int longestValidParentheses(String s) {
    //     Stack<Integer> index = new Stack<>();
    //     index.add(-1);
    //     int max = 0;
    //     for(int i = 0; i < s.length(); i++){
    //         if(s.charAt(i) == '('){
    //             index.add(i);
    //         }
    //         else{
    //             if(!index.isEmpty() && index.peek() != -1 && s.charAt(index.peek()) == '('){
    //                 index.pop();
    //                 max = Math.max(max, i - index.peek());
    //             }
    //             else{
    //                 index.add(i);
    //             }
    //         }
    //     }
    //     return max;
    // }
        int longest = 0;
        
        int leftCount = 0;
        int rightCount = 0;
        
        for (int start = 0, end = 0; end < s.length(); end++) {
            if (s.charAt(end) == '(') {
                leftCount++;
            } else {
                rightCount++;
            }
            
            if (leftCount == rightCount) {
                longest = Math.max(longest, end - start + 1);
            } else if (leftCount < rightCount) {
                leftCount = 0;
                rightCount = 0;
                start = end + 1;
            }
        }
        
        leftCount = 0;
        rightCount = 0;
        
        for (int start = s.length()-1, end = s.length()-1; start >= 0; start--) {
            if (s.charAt(start) == ')') {
                rightCount++;
            } else {
                leftCount++;
            }
            
            if (leftCount == rightCount) {
                longest = Math.max(longest, end - start + 1);
            } else if (leftCount > rightCount) {
                leftCount = 0;
                rightCount = 0;
                end = start - 1;
            }
        }
        
        return longest;
    }
}