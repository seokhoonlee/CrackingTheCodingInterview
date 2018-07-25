// 2.5 Sum List

class Main {
    public static class Solution {
        public static LinkedList solve(LinkedList ll1, LinkedList ll2) {
            Node n1 = ll1.head;
            Node n2 = ll2.head;
            
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            
            while (n1 != null) {
                sb1.insert(0, n1.value());
                n1 = n1.next;
            }
            
            while (n2 != null) {
                sb2.insert(0, n2.value());
                n2 = n2.next;
            }
            
            String s = String.valueOf(Integer.valueOf(sb1) + Integer.valueOf(sb2));
            
            int len = s.length();
            LinkedList rl = new LinkedList();
            
            for (int i = 0; i < len; i++) {
                rl.append(Node(s.charat(len - 1 - i)));
            }
            
            return rl;
        }
    }
}

// different version

// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        
        m.solve();
    }
    
    public class LinkedListNodeWithCarry {
        public int data;
        public int carry;
        public LinkedListNodeWithCarry next;
        
        public LinkedListNodeWithCarry(int data) {
            this.data = data;
            this.carry = 0;
            this.next = null;
        }
        
        public LinkedListNodeWithCarry() {
            this(0);
        }
    }       
    
    public class LinkedListNode {
        public int data;
        public LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
        
        public LinkedListNode() {
            this(0);
        }
    }
    
    public void solve() {
        LinkedListNodeWithCarry l11 = new LinkedListNodeWithCarry(6);
        LinkedListNodeWithCarry l12 = new LinkedListNodeWithCarry(1);
        LinkedListNodeWithCarry l13 = new LinkedListNodeWithCarry(7);
        
        l11.next = l12;
        l12.next = l13;
        
        LinkedListNodeWithCarry l21 = new LinkedListNodeWithCarry(3);
        LinkedListNodeWithCarry l22 = new LinkedListNodeWithCarry(9);
        LinkedListNodeWithCarry l23 = new LinkedListNodeWithCarry(5);
        
        l21.next = l22;
        l22.next = l23;
        
        LinkedListNodeWithCarry n = sumList2(l11, l21);
        
        if (n.carry == 0) {
            //
        } else  {
            LinkedListNodeWithCarry lc = new LinkedListNodeWithCarry(1);
            
            lc.next = n;
            
            n = lc;
        }
        
        while (n != null) {
            System.out.print(n.data);
            n = n.next;
        }     
    }
        
    public LinkedListNode sumList(LinkedListNode n1, LinkedListNode n2, int carry) {
        if (n1 == null && n2 == null && carry == 0) {
            return null;
        }
        
        LinkedListNode n = new LinkedListNode();
        
        int value = carry;
        
        if (n1 != null) {
            value += n1.data;
        }
        
        if (n2 != null) {
            value += n2.data;
        }
        
        n.data = value % 10;
        
        LinkedListNode next = sumList(n1 != null ? n1.next : n1, n2 != null ? n2.next : n2, value / 10);
        
        n.next = next;
        
        return n;
    }
    
    public LinkedListNodeWithCarry sumList2(LinkedListNodeWithCarry n1, LinkedListNodeWithCarry n2) {
        if (n1 == null && n2 == null) {
            return null;
        }
        
        LinkedListNodeWithCarry n = new LinkedListNodeWithCarry();
        
        int value = 0;
        
        if (n1 != null) {
            value += n1.data;
        }
        
        if (n2 != null) {
            value += n2.data;
        }
        
        LinkedListNodeWithCarry next = sumList2(n1 != null ? n1.next : n1, n2 != null ? n2.next : n2);
        
        if (next != null) {
            value += next.carry;
        }
        
        n.data = value % 10;
        n.carry = value / 10;
        
        n.next = next;
        
        return n;
    }
}

