// Question 1.6 String Compression

class Main {  
    public static class Solution1 {
        public String solve(String s) {
            StringBuilder sb1 = new StringBuilder(" " + s + " ");
            StringBuilder sb2 = new StringBuilder();
            
            int count = 0;
                
            for (int i = 0; i < sb1.length() - 1; i++) {
                count++;
                
                if (sb1.charAt(i) != sb1.charAt(i + 1)) {
                    if (sb1.charAt(i) != ' ') {
                        sb2.append(sb1.charAt(i));
                        sb2.append(count);
                    }
                    
                    count = 0;
                }
            }
            
            sb1.deleteCharAt(0);
            sb1.deleteCharAt(sb1.length() - 1);
            
            if (sb1.length() > sb2.length()) {
                return sb2.toString();
            } else {
                return sb1.toString();
            }   
        }
    }
    
    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();
        
        System.out.print(sol1.solve("abc") + "\n");
        System.out.print(sol1.solve("aaa") + "\n");
        System.out.print(sol1.solve("aaabbb") + "\n");
        System.out.print(sol1.solve("aaabbbb") + "\n");
        System.out.print(sol1.solve("aaab") + "\n");
    }
}

