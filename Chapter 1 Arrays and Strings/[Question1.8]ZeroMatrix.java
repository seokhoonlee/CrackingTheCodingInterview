// 1.8 Zero Matrix

class Main {
    public static class Solution {
        public static int[][] solve(int[][] A) {
            int m = A.length;
            int n = A[0].length;
            
            boolean[] mHasZero = new boolean[m];
            boolean[] nHasZero = new boolean[n];
            
            for (int i = 0; i < m; i++) {
                mHasZero[i] = false;
            }
            
            for (int j = 0; j < n; j++) {
                nHasZero[j] = false;
            }
            
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i][j] == 0) {
                        mHasZero[i] = true;
                        nHasZero[j] = true;
                    }
                }
            }
            
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (mHasZero[i] || nHasZero[j]) {
                        A[i][j] = 0;
                    }
                }
            }
            
            return A;
            
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
            
            Solution sol = new Solution();
            
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
