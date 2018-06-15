// 2.2 Return Kth to Last

class Main {
    public static class Solution {
        public static LinkedListNode solve (LinkedList ll, int k) {
            
            LinkedListNode n1 = ll.head;
            LinkedListNode n2 = ll.head;
            
            if (k < 0) {
                return null;
            }
            
            for (int i = 0; i < k; i++) {
                if (n1 == null) {
                    return null;
                }
                n1 = n1.next;
            }
            
            while (n1 != null) {
                n1 = n1.next;
                n2 = n2.next;
            }
            
            return n2;
        }
    }
}
