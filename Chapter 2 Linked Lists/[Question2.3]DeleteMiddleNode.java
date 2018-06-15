// 2.3 Delete Middle Node

class Main {
    public static class Solution {
        public static boolean solve (LinkedListNode n) {
            
            if (n == null || n.next == null) {
                return false;
            }
            
            LinkedListNode next = n.next;
            
            n.value() = next.value();
            n.next = next.next;
            
            return true;
        }
    }
}
