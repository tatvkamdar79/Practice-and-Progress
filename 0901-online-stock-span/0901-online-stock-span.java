class StockSpanner {
    public Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int c = 1;
        while(!st.isEmpty() && st.peek()[0] <= price)
            c += st.pop()[1];
        st.push(new int[]{price, c});
        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */