// 1.4 Palindrome Permutation

class Main {
    public static class Solution {
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
        Solution sol = new Solution();
        
        System.out.print(sol.solve("a") + "\n");
        System.out.print(sol.solve("ab") + "\n");
        System.out.print(sol.solve("aba") + "\n");
        System.out.print(sol.solve("aab") + "\n");
        System.out.print(sol.solve("aabb") + "\n");
        System.out.print(sol.solve("tacocat") + "\n");
        System.out.print(sol.solve("atcocta") + "\n");
    }
}
