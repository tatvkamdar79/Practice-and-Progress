class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n = nums.length;
        List<Boolean> ans = new ArrayList<>();
        for(int q = 0; q < l.length; q++){
            int len = r[q] - l[q] + 1;
            int[] arr = new int[len];
            for(int i = 0; i < len; i++){
                arr[i] = nums[l[q]+i];
            }
            Arrays.sort(arr);
            boolean isAP = true;
            for(int i = 1; i < len - 1; i++){
                if(arr[i] - arr[i-1] != arr[i+1] - arr[i]){
                    isAP = false;
                    break;
                }
            }
            ans.add(isAP);
        }
        return ans;
    }
}