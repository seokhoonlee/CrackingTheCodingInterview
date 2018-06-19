class Stack {
    public class Node<T> {
        public T t;
        public Node<T> next;
        public Node (T t) {
            this.t = t;
            this.next = null;
        }
    }
        
    Node top;
    
    public T pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        
        Node n = top;
        top = top.next;
        
        return n.t;
    }
    
    public T peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        
        return top.t;
    }
    
    public void push(T t) {
        Node n = new Node(t);
        n.next = top;
        top = n;
    }
}
