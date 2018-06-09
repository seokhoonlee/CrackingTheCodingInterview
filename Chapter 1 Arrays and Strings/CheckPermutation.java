// Question 1.2 Check Permutation
// Solution 1: Check if count of char in string is same Time: O(N), Space: O(1)

class Main {
    public static class Solution1 {
        public boolean solve(String inputString1, String inputString2) {            
            int stringLength = inputString1.length();
            
            if (stringLength != inputString2.length()) {
                return false;
            }
            
            int[] countArray = new int[26];
            
            for (int i = 0; i < 26; i++) {
                countArray[i] = 0;
            }
            
            for (int i = 0; i < stringLength; i++) {
                char charAtIndex = inputString1.charAt(i);
                countArray[charAtIndex - 'a']++;
            }
            
            for (int i = 0; i < stringLength; i++) {
                char charAtIndex = inputString2.charAt(i);
                countArray[charAtIndex - 'a']--;
            }
            
            for (int i = 0; i < 26; i++) {
                if (countArray[i] != 0) {
                    return false;
                }
            }
            
            return true;
        }
    }
    
    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();
        
        System.out.print(sol1.solve("abc", "abc") + "\n");
        System.out.print(sol1.solve("xyzz", "zzyx") + "\n");
        System.out.print(sol1.solve("hi", "hii") + "\n");
        System.out.print(sol1.solve("byee", "bye") + "\n");
        System.out.print(sol1.solve("", "") + "\n");
    }
}

