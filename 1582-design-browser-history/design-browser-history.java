class BrowserHistory {
    public class Node{
        String url;
        Node next,pre;
        Node(String url){
            this.url = url;
            next = null;
            pre = null;
        }
    }
    Node curr;
    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node n = new Node(url);
        curr.next = n;
        n.pre = curr;
        curr = n;
    }
    
    public String back(int steps) {
        while(curr.pre != null && steps-- > 0){
            curr = curr.pre;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        while(curr.next != null && steps-- > 0) {
            curr = curr.next;
        }
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */