class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            if(i == 0){
                temp.add(1);
                l.add(temp);
                continue;
            }
            if(i == 1){
                temp.add(1);
                temp.add(1);                
                l.add(temp);
                continue;
            }
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    temp.add(1);
                }
                else{
                    temp.add(l.get(i-1).get(j) + l.get(i-1).get(j-1));
                }
            }
            l.add(temp);
        }
        return l;
    }
}