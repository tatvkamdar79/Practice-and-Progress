class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        int i2 = 0, i3 = 0, i5 = 0;
        while(l.size() < n){
            while(l.get(i2) * 2 <= l.get(l.size() - 1))  i2++;
            while(l.get(i3) * 3 <= l.get(l.size() - 1))  i3++;
            while(l.get(i5) * 5 <= l.get(l.size() - 1))  i5++;
            l.add(Math.min(Math.min(l.get(i2)*2,l.get(i3)*3),l.get(i5)*5));
        }
        return l.get(l.size() - 1);
    }
}