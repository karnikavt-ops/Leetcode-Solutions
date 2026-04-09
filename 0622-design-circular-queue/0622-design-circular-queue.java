class MyCircularQueue {
    int[] arr;
    int front,rear,cnt,capacity;

    public MyCircularQueue(int k) {
        arr=new int[k];
        capacity = k;
        front = 0;
        rear = -1;
        cnt = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        rear=(rear+1)%capacity;
        arr[rear]=value;
        cnt++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
            return false;
        front = (front+1)%capacity;
        cnt--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) 
            return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()) 
            return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return (cnt==0);
    }
    
    public boolean isFull() {
        return (capacity==cnt);
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