// 1.5 One Away

class Main {
    public static final int MAX_EDIT = 1;
    
    public static class Solution {
        public boolean solve(String s1, String s2) {
            int len1 = s1.length();
            int len2 = s2.length();
            
            if (len1 - len2 > 1 || len2 - len1 > 1) {
                return false;
            }
            
            if (len1 > len2) {
                int tempLen = len1;
                len1 = len2;
                len2 = tempLen;
                
                String tempS = s1;
                s1 = s2;
                s2 = tempS;
            }
                
            int i = 0;
            int j = 0;
            int numEdit = 0;
            
            StringBuilder sb1 = new StringBuilder(" " + s1 + " ");
            StringBuilder sb2 = new StringBuilder(" " + s2 + " ");      
            len1 += 2;
            len2 += 2;
            
            while (i < len1 && j < len2) {
                if (sb1.charAt(i) != sb2.charAt(j)) {
                    numEdit++;
                    
                    if (numEdit > MAX_EDIT) {
                        return false;
                    }
                    
                    if (len1 < len2) {
                        i--;
                    }
                }
                
                i++;
                j++;
            }
            
            return true;
        }
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.print(sol.solve("pale", "ple") + "\n");
        System.out.print(sol.solve("pales", "pale") + "\n");
        System.out.print(sol.solve("pale", "bale") + "\n");
        System.out.print(sol.solve("pale", "bake") + "\n");
        System.out.print(sol.solve("pale", "pale") + "\n");
        System.out.print(sol.solve("palest", "pale") + "\n");
    }
}

