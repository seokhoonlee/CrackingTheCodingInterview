// Question 1.4 One Away
// Solution 1: If length is same, replace. If length differ by one, delete: O(N), Space: O(1)

class Main {
    public static class Solution1 {
        public boolean solve(String inputString1, String inputString2) {
            int stringLength1 = inputString1.length();
            int stringLength2 = inputString2.length();
            
            if (stringLength1 > stringLength2) { // ensure inputString1 is always shorter or equal than inputString2
                String tempString;
                tempString = inputString1;
                inputString1 = inputString2;
                inputString2 = tempString;
                
                int tempLength;
                tempLength = stringLength1;
                stringLength1 = stringLength2;
                stringLength2 = tempLength;
            }
            
            boolean edited = false;
            int i = 0;
            int j = 0;    
          
            while (i < stringLength1 && j < stringLength2) {
                if (inputString1.charAt(i) != inputString2.charAt(j)) {
                    if (edited) {
                        return false;
                    } else {
                        edited = true;
                        
                        if (stringLength1 != stringLength2) {
                            i--;
                        }
                    }
                }
                
                i++;
                j++;
            }
            
            return true;
        }
    }
    
    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();
        
        System.out.print(sol1.solve("pale", "ple") + "\n");
        System.out.print(sol1.solve("pales", "pale") + "\n");
        System.out.print(sol1.solve("pale", "bale") + "\n");
        System.out.print(sol1.solve("pale", "bake") + "\n");
        System.out.print(sol1.solve("pale", "pale") + "\n");
    }
}

