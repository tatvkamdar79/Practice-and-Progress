class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // int sum = 0, rem = 0, count = 0;
        // Map<Integer, Integer> mp = new HashMap<>();
        // mp.put(0,1);
        // for(int i = 0; i < nums.length; i++){
        //     sum += nums[i];
        //     rem = sum % k;
        //     if(rem < 0) rem += k;
        //     if(mp.containsKey(rem)){
        //         count += mp.get(rem);
        //     }
        //     mp.put(rem, mp.getOrDefault(rem, 0) + 1);
        // }
        // return count;
        int[] frq = new int[k];
        int sum=0, count =0;
        frq[0] = 1;
        for(int i=0 ; i<nums.length ; i++){
            sum += nums[i];
            int rem = sum%k;
            if(rem < 0) rem += k;
            count += frq[rem];
            frq[rem]++;
        }
        return count;
    }
}