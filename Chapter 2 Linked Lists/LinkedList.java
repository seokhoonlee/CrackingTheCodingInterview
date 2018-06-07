class Main {
    public static class Node<T> {
        private T t;
        public Node prev;
        public Node next;
        
        public Node(T t) {
            this.t = t;
            this.prev = null;
            this.next = null;
        }
        
        public void set(T t) {
            this.t = t;
        }
        
        public T get() {
            return this.t;
        }            
    }
    
    public static class LinkedList {
        public Node head;
        public Node tail;
        
        public LinkedList() {
            this.head = null;
            this.tail = null;
        }
        
        public void appendNode(Node n) {
            if (this.head == null) {
                this.head = n;
                this.tail = n;
            } else {
                Node iter = head;
                
                while (iter.next != null) {
                    iter = iter.next;
                }
                
                iter.next = n;
                n.prev = iter;
                this.tail = n;
            }
        }
        
        public Node getNodeAtIndex(int index) {
            if (index < 0) {
                return null;
            }
            
            Node iter = this.head;
            
            for (int i = 0; i < index; i++) {
                if (iter.next == null) {
                    return null;
                } else {
                    iter = iter.next;
                }
            }
            
            return iter;
        }
        
        public void removeNodeAtIndex(int index) {
            Node n = this.getNodeAtIndex(index);
            
            if (n == null) {
                return;
            }
            
            if (n.next == null && n.prev == null) {
                this.head = null;
                this.tail = null;
            } else if (n.next == null) {
                this.tail = n.prev;
                this.tail.next = null;
            } else if (n.prev == null) {
                this.head = n.next;
                this.head.prev = null;
            } else {
                n.prev.next = n.next;
                n.next.prev = n.prev;
            }
        }
    }
    
    public static void main(String[] args) {
        Node<Integer> n = new Node(4);
        
        System.out.print(n.get());
        
        
    }
}