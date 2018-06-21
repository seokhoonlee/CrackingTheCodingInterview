class Main {
    public class MyQueue<T> {
        public class Node<T> {
            public T t;
            public Node<T> next;
            public Node(T t) {
                this.t = t;
                this.next = null;
            }
        }
        
        Node front;
        Node back;
        
        public T dequeue() {
            if (front == null) {
                throw new NoSuchElementException();
            }
            
            T value = front.value();
            front = front.next;
            
            if (front == null) {
                back = null;
            }
            
            return value;
        }
        
        public void enqueue(T t) {
            Node<T> node = new Node(t);
            
            if (back == null) {
                front = node;
                back = node;
            } else {
                back.next = node;
                back = node;
            }
        }
        
        public T peek() {
            if (front == null) {
                throw new NoSuchElementException();
            }
            
            return front.value();
        }
    }
}
