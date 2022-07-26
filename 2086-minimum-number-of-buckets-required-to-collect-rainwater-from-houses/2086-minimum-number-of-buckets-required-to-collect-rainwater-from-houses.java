class Solution {
    public int minimumBuckets(String str) {
        char[] street = str.toCharArray();
        int buckets = 0;
        for(int i = 0; i < street.length; ++i){
            if(street[i] == 'H'){
                if(i > 0 && street[i-1] == 'B')
                    continue;
                
                if(i < street.length - 1 && street[i+1] == '.'){
                    buckets++;
                    street[i+1] = 'B';
                    continue;
                }   
                
                if(i > 0 && street[i-1] == '.'){
                    buckets++;
                    street[i-1] = 'B';
                    continue;
                }
                return -1;
            }
        }
        return buckets;
    }
}