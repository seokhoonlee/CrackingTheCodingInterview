// 1.9 String Rotation

class Main {
    public static class Solution {
        public static boolean solve(String s1, String s2) {
            StringBuilder sb = new StringBuilder(s2 + s2);
            
            s2 = sb.toString();
            
            return s2.indexOf(s1) != -1;
        }
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.print(sol.solve("waterbottle", "ottlewaterb"));
    }
}
