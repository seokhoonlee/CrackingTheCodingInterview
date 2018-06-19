// 2.4 Partition

class Main
    public static class Solution {
        public static void solve(LinkedList ll, int x) {
            LinkedListNode smallHead = null;
            LinkedListNode smallTail = null;
            LinkedListNode largeHead = null;
            LinkedListNode largeTail = null;
            LinkedListNode n = ll.head;
            
            while (n != null) {
                if (n.value() < x && smallHead == null) {
                    smallhead = n;
                    smallTail = n;
                } else if (n.value() >= x && largeHead == null) {
                    largeHead = n;
                    largeTail = n;
                } else if (smallHead != null && largeHead != null) {
                    break;
                }
                
                n = n.next;
            }
            
            n = ll.head;
            
            while (n != null) {
                if (n.value() < x && n != smallHead) {
                    smallTail.next = n;
                    smallTail = n;
                } else if (n.value() >= x && n != largeHead) {
                    largeTail.next = n;
                    largeTail = n;
                }
                
                n = n.next;
            }
            
            smallTail.next = largeHead;
            largeTail.next = null;
            ll.head = smallHead;
        }
    }
}
