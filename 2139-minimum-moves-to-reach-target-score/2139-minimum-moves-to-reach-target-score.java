class Solution {
    public int minMoves(int target, int maxDoubles) {
        if(target == 1)
            return 0;
        int c = 0;
        while(maxDoubles != 0){
            if(target % 2 == 0){
                target /= 2;
                --maxDoubles;
            }
            else{
                target -= 1;
            }
            c++;
            if(target == 1)
                return c;
        }
        return c + (target - 1);
    }
}