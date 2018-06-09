// Question 1.3 URLify
// Solution 1: Check if count of char in string is same Time: O(N), Space: O(1)

class Main {
    public static class Solution1 {
        public String solve(String inputString, int stringLength) {            
            char[] charArray = inputString.toCharArray();
            
            int j = 0;
            
            for (int i = 0; i < stringLength; i++) {
                if (inputString.charAt(i) == ' ') {
                    charArray[j] = '%';
                    charArray[j + 1] = '2';
                    charArray[j + 2] = '0';
                    
                    j += 3;
                } else {
                    charArray[j] = inputString.charAt(i);
                    j++;
                }
            }
            
            return String.valueOf(charArray);
        }
    }
    
    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();
        
        System.out.print(sol1.solve("apple and banana      ", 16) + "\n");
    }
}

