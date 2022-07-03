class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while(i < a.length){
            if(s.isEmpty() || s.peek() < 0){
                s.push(a[i]);
                i++;
            }   
            else if(!s.isEmpty() && s.peek()*a[i] < 0){
                int second = Math.abs(a[i]);
                if(Math.abs(s.peek()) == second){
                    s.pop();
                    i++;
                    continue;
                }
                else if(Math.abs(s.peek()) > second){
                    i++;
                    continue;
                }
                else{
                    s.pop();
                    continue;
                }
            }
            else{
                s.push(a[i]);
                i++;
            }
        }
        // System.out.println(Arrays.deepToString(s.toArray()));
        // int[] r = new int[s.size()];
        // res = s.toArray(res);
        int[] res = new int[s.size()];
        for(int j = res.length - 1; j >= 0; j--){
            res[j] = s.pop();
        }
        return res;
    }
}