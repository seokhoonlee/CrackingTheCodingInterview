// Question 1.4 Palindrome Permutation
// Solution 1: Count the number of char in a string to determine if palindrome permutation : O(N), Space: O(1)

class Main {
    public static class Solution1 {
        public boolean solve(String inputString) {
            int[] countArray = new int[26];
            for (int i = 0; i < 26; i++) {
                countArray[i] = 0;
            }
            
            for (int i = 0; i < inputString.length(); i++) {
                countArray[inputString.charAt(i) - 'a']++;
            }
            
            int numOdd = 0;
            for (int i = 0; i < 26; i++) {
                if (countArray[i] % 2 == 1) {
                    numOdd++;
                }
            }
            
            if (numOdd > 1) {
                return false;
            } else {
                return true;
            }
        }
    }
    
    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();
        
        System.out.print(sol1.solve("a") + "\n");
        System.out.print(sol1.solve("ab") + "\n");
        System.out.print(sol1.solve("aba") + "\n");
        System.out.print(sol1.solve("aab") + "\n");
        System.out.print(sol1.solve("aabb") + "\n");
        System.out.print(sol1.solve("tacocat") + "\n");
        System.out.print(sol1.solve("atcocta") + "\n");
    }
}
