// 3.1 Three In One

class Main {
    public class ThreeStack<T> {
        private ArrayList<T> al;
        private int top1;
        private int top2;
        private int top3;
        
        public ThreeStack() {
            this.al = new ArrayList();
            top1 = 0;
            top2 = 1;
            top3 = 2;
        }
        
        public void push1(T t) {
            al[top1 + 3] = t;
            top1 += 3;
        }
        
        public T pop1() {
            T t = al[top1];
            top1 -= 3;
            return t;
        }
        
        public T peek1() {
            return al[top1];
        }
    }
}
