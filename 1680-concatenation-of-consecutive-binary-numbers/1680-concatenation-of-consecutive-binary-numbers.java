class Solution {
    public int concatenatedBinary(int n) {
        long modulo = (long)(1e9 + 7);
        int binaryPlaces = 0;
        long result = 0;
        for(int i = 1; i <= n; i++){
            if((i & (i-1)) == 0)    binaryPlaces++;
            result = ((result << binaryPlaces) + i) % modulo;
        }
        return (int) result;
    }
}