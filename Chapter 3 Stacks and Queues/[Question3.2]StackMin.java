// 3.2 Stack Min

class Main {
    public class MinStack {
        Node top;
        Node min;
        
        public MinStack() {
            top = null;
            min = null;
        }
        
        public int peek() {
            if (top == null) {
                throw new NoSuchElementException();
            }
            
            return top.value();
        }
        
        public int min() {
            if (min == null) {
                throw new NoSuchElementException();
            }
            
            return min.value();
        }
        
        public int pop() {
            if (top == null) {
                throw new NoSuchElementException();
            }
            
            int v = top.value();
            
            top = top.next;
            
            min = min.next;
        }
        
        public void push(int v) {
            Node n1 = new Node(v);
            Node n2;
            
            if (v < min.value()) {
                n2 = new Node(v);
            } else {
                n2 = new Node(min.value());
            }
            
            n1.next = top;
            top = n1;
            
            n2.next = min;
            min = n2;
        }
    }
}
