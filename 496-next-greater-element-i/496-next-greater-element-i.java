class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);
        for(int i = 0; i < nums1.length; i++)
            mp.put(nums1[i], i);
        
        for(int i = 0; i < nums2.length; i++){
            if(st.isEmpty())
                st.add(i);
            else if(nums2[i] <= nums2[st.peek()])
                st.add(i);
            else{
                while(!st.isEmpty() && nums2[i] > nums2[st.peek()]){
                    if(mp.containsKey(nums2[st.peek()])){
                        ans[mp.get(nums2[st.peek()])] = nums2[i];
                    }
                    st.pop();
                }
                st.add(i);
            }
        }
        return ans;
    }
}