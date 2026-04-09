class MyLinkedList {
    int cnt;
    class Node{
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val = val;
            prev=null;
            next=null;
        }
    }
    Node head;
    Node tail;
    public MyLinkedList() {
        head=tail=null;
        cnt=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=cnt) return-1;
        Node temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node nn = new Node(val);
        if(head==null){
            head=nn;
            tail=nn;
        }
        else{
            head.prev=nn;
            nn.next=head;
            head=nn;
        }
        cnt++;
    }
    
    public void addAtTail(int val) {
       Node nn = new Node(val);
       if(head==null){
        head=tail=nn;
       }
       else{
        nn.prev=tail;
        tail.next=nn;
        tail=nn;
       } 
       cnt++;
    }

    public void addAtIndex(int index, int val) {
        if(index<0 || index>cnt) return;
        if(index==0){
            addAtHead(val);
            return;
        }
        else if(index==cnt){
            addAtTail(val);
            return;
        }
        else{
            Node nn = new Node(val);
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            nn.next=temp.next;
            nn.prev=temp;
            temp.next=nn;
            nn.next.prev=nn;
            cnt++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=cnt) return;
        if(index==0){
            if(head==tail) head=tail=null;
            else {
                head = head.next; 
                head.prev=null;
                }
        }

        else if(index==cnt-1){
            tail = tail.prev;
            tail.next=null;
        }
        else{
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
        cnt--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */