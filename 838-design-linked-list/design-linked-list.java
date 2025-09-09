class MyLinkedList {
   class Node{
    int val;
    Node next;
    Node(){}
    Node(int data){
        this.val = data;
    }
   }
   Node root;
   int count;
    public MyLinkedList() {
        root = null;
        count = 0;
    }
    
    public int get(int index) {
        Node t = root;
        if(index<0 || index >= count) return -1;
        while(index > 0)
        {
            t=t.next;
            index--;
        }
        return t.val;
    }
    
    public void addAtHead(int val) {
        Node t = new Node(val);
        t.next = root;
        root = t;
        count++;
    }
    
    public void addAtTail(int val) {
         Node t = root;
        if (t == null) {
            addAtHead(val);
            return;
        }
        while (t.next != null) {
            t = t.next;
        }
        t.next = new Node(val);
        count++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index > count || index < 0)
        return ;
        if(index == count)
        {
            addAtTail(val);
            return ;
        }
        if(index == 0)
        {
            addAtHead(val);
            return ;
        }
        Node pre = null;
        Node curr = root;
        while(index > 0){
            pre = curr;
            curr=curr.next;
            index--;
        }
        Node tt= new Node(val);
        pre.next = tt;
        tt.next = curr;
        count++;
    }
    
    public void deleteAtIndex(int index) {
        if(index <0 || index >= count) return ;
        if (index == 0) {
            root = root.next;
            count--;
            return;
        }
        Node pre = null;
        Node curr = root;
        while(index > 0 && curr != null){
            pre = curr;
            curr = curr.next;
            index--;
        }
        pre.next = curr.next;
        count--;
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