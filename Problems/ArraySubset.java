package Problems;

import java.util.Scanner;

/**
 * Created by Jay Patel on 13/4/17.
 */
public class ArraySubset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int c = 0;
        ArraySubset arraySubset = new ArraySubset();
//        arraySubset.solution(matrix,n);
        for (int i=1;i<=n;i++) {
            c += arraySubset.printSumSimple(matrix, i);
        }
        System.out.println(c);
    }

    private void solution(int[][] matrix,int n){
//        for (int k=0;k<n;k++) {
//            for (int i = 0; i < matrix.length-k; i++) {
//                for (int j = 0; j < matrix.length - k; j++) {
//                    System.out.print(matrix[i][j] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//            System.out.println();
//        }

        outerrow : for (int k=0;k<n;k++) {
            outercolumn:
            for (int l = 0; l < n; l++) {
                for (int i = k; i < matrix.length - l; i++) {
                    for (int j = l; j < matrix.length - l; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println();
            }
        }
    }

    private int printSumSimple(int[][] mat, int k)
    {
        int count = 0;
        boolean b=true;
        int n = mat.length;
        // k must be smaller than or equal to n
        if (k > n) return 0;

        // row number of first cell in current sub-square of size k x k
        for (int i=0; i<n-k+1; i++)
        {
            // column of first cell in current sub-square of size k x k
            for (int j=0; j<n-k+1; j++)
            {
                // Calculate and print sum of current sub-square
                b=true;
                int firstChar=0;
                for (int p=i; p<k+i; p++) {
                    firstChar=mat[p][j];
                    for (int q = j; q < k + j; q++) {
                        if(mat[p][q] != firstChar){
                            b=false;
                        }
                    }
                }
                if(b==true){
                    count++;
                }
            }
        }
        return count;
    }
}
