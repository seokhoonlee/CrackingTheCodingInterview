// 2.6 Palindrome

class Main {
    public static class Solution {
        public static boolean solve(LinkedList ll) {
            int len = 0;
            Node n = ll.head;
            
            if (n == null) {
                return true;
            }
            
            while (n != null) {
                len++;
                n = n.next;
            }
            
            int[] A = new int[len];
            n = ll.head;
            
            for (int i = 0; i < len; i++) {
                A[i] = n.value();
                n = n.next;
            }
            
            for (int i = 0; i < len/2; i++) {
                if (A[i] != A[len - 1 - i]) {
                    return false;
                }
            }
            
            return true;
        }
    }
}
