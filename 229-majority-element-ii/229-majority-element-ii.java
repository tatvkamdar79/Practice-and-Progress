class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length == 1)    return Arrays.asList(nums[0]);
        
        int num1 = nums[0], num2 = nums[1], c1 = 0, c2 = 0;
        for(int i : nums){
            if(i == num1)
                c1++;
            else if(i == num2)
                c2++;
            else if(c1 == 0){
                num1 = i; c1 = 1;
            }
            else if(c2 == 0){
                num2 = i; c2 = 1;
            }
            else{
                c1--; c2--;
            }
        }
        c1 = 0; c2 = 0;
        for(int i : nums){
            if(i == num1)   c1++;
            else if(i == num2)   c2++;
        }
        List<Integer> res = new ArrayList<>();
        if(c1 > nums.length / 3)    res.add(num1);
        if(c2 > nums.length / 3)    res.add(num2);

        return res;
    }
}