/*
m => length from starting of list to starting of loop (i.e 1-2-3-4)
l => length of loop (i.e. 4-5-6-7-8-9)
k => length between starting of loop to meeting point (i.e. 4-5-6-7)

Total distance traveled by slowPtr = m + p(l) +k
where p => number of repetition of circle covered by slowPtr

Total distance traveled by fastPtr = m + q(l) + k
where q => number of repetition of circle covered by fastPtr

Since,
fastPtr running twice faster than slowPtr

Hence,
Total distance traveled by fastPtr = 2 X Total distance traveled by slowPtr
i.e
m + q(l) + k = 2 * ( m + p(l) +k )
or, m + k = q(l) - p(l)
or, m + k = (q-p) l
or, m = (q-p) l - k

So,
If slowPtr starts from beginning of list and travels "m" length then, it will reach to Point 4 (i.e. 1-2-3-4)

and
fastPtr start from Point 7 and travels " (q-p) l - k " length then, it will reach to Point 4 (i.e. 7-8-9-4),
because "(q-p) l" is a complete circle length with " (q-p) " times.
*/

// 2.8 Intersection

class Main {
    public static class Solution {
        public static LinkedList solve(LinkedList ll1, LinkedList ll2) {
            LinkedListNode slow = head;
            LinkedListNode fast = head;

            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if(fast == slow) {
                    break;
                }
            }

            if(fast == null || fast.next == null) {
                return null;
            }

            slow = head;
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }

            return fast;
        }
    }
}
