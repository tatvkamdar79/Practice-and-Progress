class Solution {
    public int[] dailyTemperatures(int[] temp) {
//         Stack<int[]> st = new Stack<>();
        
//         int[] ans = new int[temp.length];
        
//         int i = 0;
        
//         while(i < temp.length){
//             while(!st.isEmpty() && i < temp.length && temp[i] > st.peek()[0]){
//                 ans[st.peek()[1]] = i - st.pop()[1];
//             }
//             st.push(new int[]{temp[i], i++});
//         }
//         return ans;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temp.length];
        int i = 0;
        while(i < temp.length){
            while(!st.isEmpty() && i < temp.length && temp[st.peek()] < temp[i])
                ans[st.peek()] = i - st.pop();
            st.push(i++);
        }
        return ans;
    }
}

// 73, 72, 71, 70, 80
    
    /*
     70
     71
     72
     73
     */