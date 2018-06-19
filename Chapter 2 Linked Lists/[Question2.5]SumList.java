// 2.5 Sum List

class Main
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
