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
    
    public static class Solution2 {
        public static int[][] solve(int[][] A) {
            int n = A.length;
            
            for (int i = 0; i < n/2; i++) {
                for (int j = i; j < n - 1 - i; j++) {
                    int temp = A[i][j];
                    
                    int oi = i;
                    int oj = j;
                    int ni = n - 1 - j;
                    int nj = i;
                    
                    for (int k = 0; k < 4; k++) {
                        if (k != 3) {
                            A[oi][oj] = A[ni][nj];
                            
                            oi = ni;
                            oj = nj;
                            ni = n - 1 - oj;
                            nj = oi;
                        } else {
                            A[oi][oj] = temp;
                        }
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
            
            Solution2 sol = new Solution2();
            
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
