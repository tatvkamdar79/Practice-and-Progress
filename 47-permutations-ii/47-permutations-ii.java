class Solution {
    
    List<List<Integer>> lists;
    boolean[] added;
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        lists = new ArrayList<>();
        Arrays.sort(nums);
        added = new boolean[nums.length];
        permuteUnique(nums, new ArrayList<>());
        return lists;
    }
    
    private void permuteUnique(int[] nums, List<Integer> list) {
        if(list.size() == nums.length) {
            lists.add(new ArrayList(list));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(added[i])
                continue;
            // avoid permute duplicates
            if(i > 0 && nums[i] == nums[i - 1] && !added[i - 1])
                continue;
            list.add(nums[i]);
            added[i] = true;
            permuteUnique(nums, list);
            list.remove(list.size() - 1);
            added[i] = false;
        }
    }
}
// class Solution {
//     public List<List<Integer>> permuteUnique(int[] nums) {
//         Set<List<Integer>> result = new HashSet<>();
//         boolean[] freq = new boolean[nums.length];
//         rec(nums, freq, new ArrayList<>(), result);
//         return new ArrayList(result);
//     }
    
//     public void rec(int[] nums, boolean[] freq, List<Integer> list, Set<List<Integer>> result) {
//         if(list.size() == nums.length){
//             result.add(new ArrayList<>(list));
//             return;
//         }
//         else{
//             for(int i = 0; i < nums.length; i++) {
//                 if(!freq[i]) {
//                     freq[i] = true;
//                     list.add(nums[i]);
//                     rec(nums, freq, list, result);
//                     list.remove(list.size() - 1);
//                     freq[i] = false;
//                 }
//             }
//         }
//     }
// }