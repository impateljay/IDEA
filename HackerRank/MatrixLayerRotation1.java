package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 21/4/17.
 */
public class MatrixLayerRotation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int rotations = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        rotateMatrix(matrix,n,m,rotations);
    }

    private static void rotateMatrix(int[][] matrix,int n,int m,int rotation){
        int[][] mat = new int[n][m];
        int loops = (m/2)+(m%2);
        System.out.println(loops);
        int starti,startj,endi,endj,si,sj,ti,tj;
        for (int i=0;i<loops;i++){
            starti=i;startj=i;endi=m-i-1;endj=n-i-1;si=starti+rotation;sj=startj;ti=starti;tj=startj;
            while (true){
                mat[ti][tj] = matrix[si][sj];

                if(ti<endi&&tj==startj){
                    ti++;
                } else if(ti==endi && tj<endj){
                    tj++;
                } else if(ti>starti && tj==endj){
                    ti--;
                } else if(ti==starti && tj>startj){
                    tj--;
                }

                if(si<endi&&sj==startj){
                    si++;
                } else if(si==endi && sj<endj){
                    sj++;
                } else if(si>starti && sj==endj){
                    si--;
                } else if(si==starti && sj>startj){
                    sj--;
                }
                if(si==starti && sj==startj){
                    break;
                }
            }
        }
        printArray(mat,n,m);
    }

    private static void printArray(int[][] matrix,int n,int m){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

/*
1 2 3
4 5 6
7 8 9
 */