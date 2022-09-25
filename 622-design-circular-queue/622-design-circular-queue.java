class MyCircularQueue {
    
    public List<Integer> q;
    int max_size;
    
    public MyCircularQueue(int k) {
        q = new ArrayList<>();
        max_size = k;
    }
    
    public boolean enQueue(int value) {
        if(q.size() < max_size){
            q.add(value);
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(q.size() > 0){
            q.remove(0);
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(q.size() > 0)
            return q.get(0);
        return -1;
    }
    
    public int Rear() {
        if(q.size() > 0)
            return q.get(q.size() - 1);
        return -1;
    }
    
    public boolean isEmpty() {
        if(q.size() == 0)
            return true;
        return false;
    }
    
    public boolean isFull() {
        if(q.size() == max_size)
            return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */