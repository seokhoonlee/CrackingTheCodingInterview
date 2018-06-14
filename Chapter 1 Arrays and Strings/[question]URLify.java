// 1.3 URLify

class Main {
    public static class Solution {
        public char[] solve(char[] str, int strLen) {   
            int urlLen = strLen;

            for (int i = 0; i < strLen; i++) {
                if (str[i] == ' ') {
                    urlLen += 2;
                }
            }
            
            System.out.print(urlLen + "\n");

            int j = urlLen - 1;

            for (int i = strLen - 1; i >= 0; i--) {
                if (str[i] == ' ') {
                    str[j] = '0';
                    str[j - 1] = '2';
                    str[j - 2] = '%';
                    j -= 3;
                } else {
                    str[j] = str[i];
                    j--;
                }
            }

            return str;
        }
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        char[] ci = {'a','p','p','l','e',' ','a','n','d',' ','b','a','n','a','n','a',' ',' ',' ',' '};
        
        for (int i = 0; i < 16; i++) {
            System.out.print(ci[i]);
        }
        System.out.print("\n");
        
        char[] co = sol.solve(ci, 16);
        
        for (int i = 0; i < co.length; i++) {
            System.out.print(co[i]);
        }
    }
