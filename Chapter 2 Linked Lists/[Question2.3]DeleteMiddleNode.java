// 2.3 Delete Middle Node

class Main {
    public static class Solution {
        public static LinkedList solve (LinkedList ll, LinkedListNode d) {
            
            LinkedListNode n = ll.head;
            LinkedListNode prev = null;
            
            while (n != null) {
                if (n == d) {
                    prev.next = n.next;
                    break;
                }
                
                prev = n;
                n = n.next;
            }
            
            return ll;
        }
    }
}
