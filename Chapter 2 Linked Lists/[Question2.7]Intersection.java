// 2.7 Intersection

class Main {
    public static class Solution {
        public static LinkedList solve(LinkedList ll1, LinkedList ll2) {
            LinkedListNode n1 = ll1.head;
            LinkedListNode n2 = ll2.head;
            
            if (n1 == null || n2 == null) {
                return null;
            }
            
            int l1 = 1;
            int l2 = 1;
            
            while (n1.next != null) {
                l1++;
                n1 = n1.next;
            }
            
            while (n2.next != null) {
                l2++;
                n2 = n2.next;
            }
            
            if (n1 != n2) {
                return null;
            }
            
            n1 = ll1.head;
            n2 = ll2.head;
            
            LinkedListNode tn;
            int tl;
            
            if (l2 > l1) {
                tl = l2;
                l2 = l1;
                l1 = tl;
                
                tn = n1;
                n1 = n2;
                n2 = tn;
            }
            
            for (int i = 0; i < l1 - l2; i++) {
                n1 = n1.next;
            }
            
            for (int i = 0; i < l2; i++) {
                if (n1 == n2) {
                    return n1;
                }
                
                n1 = n1.next;
                n2 = n2.next;
            }
            
            return null;
        }
    }
}
