class Solution {
    Map<Integer, Integer> mp = new HashMap<>();
    public int maxJumps(int[] arr, int d) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans = Math.max(ans, rec(arr, d, i));
        }
        return ans;
    }
    public int rec(int[] arr, int d, int curr){
        if(curr > arr.length - 1 || curr < 0)
            return 0;
        
        if(mp.containsKey(curr))
            return mp.get(curr);
        
        int ans = 0;
        
        for(int i = curr + 1; i <= Math.min(curr + d, arr.length - 1); i++){
            if(arr[curr] > arr[i])
                ans = Math.max(ans, rec(arr, d, i));
            else
                break;
        }
        for(int i = curr - 1; i >= Math.max(0, curr - d); i--){
            if(arr[curr] > arr[i])
                ans = Math.max(ans, rec(arr, d, i));
            else
                break;
        }
        mp.put(curr, 1 + ans);
        return ans + 1;
    }
}