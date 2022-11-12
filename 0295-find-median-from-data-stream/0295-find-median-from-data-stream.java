class MedianFinder {
    List<Integer> l;
    public MedianFinder() {
        l = new ArrayList<>();
    }
    
    public void addNum(int num) {
        int pos = Collections.binarySearch(l, num);
        if(pos < 0){
            pos = -(pos+1);
        }
        l.add(pos, num);
    }
    
    public double findMedian() {
        int n = l.size();
        if(n%2 == 0)
            return ((double)l.get(n/2) + (double)l.get(n/2 - 1))/(double)2;
        return l.get(n/2);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */