// 1.1 Is Unique

import java.util.HashMap;
import java.util.Arrays;

class Main {
    public static class Solution1 {
        public boolean solve(String inputString) {            
            int stringLength = inputString.length();
            HashMap<Integer, String> hashMap = new HashMap();
            
            for (int i = 0; i < stringLength; i++) {
                char charAtIndex = inputString.charAt(i);
                String stringAtIndex = String.valueOf(charAtIndex);
                Integer hashCode = stringAtIndex.hashCode();
                
                if (hashMap.containsValue(stringAtIndex)) {
                    return false;
                } else {
                    hashMap.put(hashCode, stringAtIndex);
                }
            }
            
            return true;
        }
    }
    
    public static class Solution2 {
        public boolean solve(String inputString) {
            int stringLength = inputString.length();
            boolean[] hasLetter = new boolean[26];
            
            for (int i = 0; i < 26; i++) {
                hasLetter[i] = false;
            }
            
            for (int i = 0; i < stringLength; i++) {
                char charAtIndex = inputString.charAt(i);
                int charIntConversion = charAtIndex - 'a';
                
                if (hasLetter[charIntConversion]) {
                    return false;
                } else {
                    hasLetter[charIntConversion] = true;
                }
            }
                
            return true;
        }
    }
    
    public static class Solution3 {
        public boolean solve(String inputString) {
            int stringLength = inputString.length();
            char[] charArray = inputString.toCharArray();
            
            Arrays.sort(charArray);
            
            for (int i = 0; i  < stringLength - 1; i++) {
                if (charArray[i] == charArray[i + 1]) {
                    return false;
                }
            }
            
            return true;
        }
    }
    
    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();
        
        System.out.print(sol1.solve("abc") + "\n");
        System.out.print(sol1.solve("xyzz") + "\n");
        
        Solution2 sol2 = new Solution2();
        
        System.out.print(sol2.solve("abc") + "\n");
        System.out.print(sol2.solve("xyzz") + "\n");
        
        Solution3 sol3 = new Solution3();
        
        System.out.print(sol3.solve("abc") + "\n");
        System.out.print(sol3.solve("xyzz") + "\n");
    }
}
