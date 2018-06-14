import java.util.HashSet;

class Main {
    public static class Node<T> {
        private T t;
        public Node next;
        
        public Node(T t) {
            this.t = t;
            this.next = null;
        }
        
        public T value() {
            return this.t;
        }
    }
    
    public static class Solution<T> {
        public static void solve(Node n) {
            HashSet hs = new HashSet();
            Node prev = null;
            
            while (n != null) {
                if (hs.contains(n.value())) {
                    prev.next = n.next;
                } else {
                    hs.add(n.value());
                    prev = n;
                }
                
                n = n.next;
            }
        }
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
    }
}
