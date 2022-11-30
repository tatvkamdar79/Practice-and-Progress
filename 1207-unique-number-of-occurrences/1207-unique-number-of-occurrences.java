class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> s = new HashSet<>();
        int[] f = new int[3000];
        for(int i : arr)
            ++f[i+1000];
        for(int i : f)
            if(i != 0)
                if(!s.add(i))
                    return false;
        return true;
    }
}