/**
 * Main class of the Java program.
 */

class Main {
    public static class Solution1 {
        public static int[][] solve(int[][] A) {
            int n = A.length;
            
            int[][] B = new int[n][n];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    B[i][j] = A[n-1-j][i];
                }
            }
            
            return B;
        }
    }
    
    public static void main(String[] args) {
        for (int k = 3; k <= 4; k++) {
            int[][] A = new int[k][k];
            
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    A[i][j] = i * k + j;
                }
            }
            
            Solution1 sol = new Solution1();
            
            int[][] B = sol.solve(A);
            
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
