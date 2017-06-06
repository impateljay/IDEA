package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jay Patel on 21/4/17.
 */
public class MatrixLayerRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int rotations = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
//        printArray(matrix,n,m);
        rotateMatrix(matrix,n,m,rotations);
    }

    private static void rotateMatrix(int[][] matrix,int n,int m,int rotation){
        int[][] mat = new int[n][m];
        ArrayList<Integer> outerLoop = new ArrayList<>();
        int starti=-1,startj=-1,endi=n,endj=m;
        while (Math.abs(endi-starti)!=1 || Math.abs(endj-startj)!=1) {
            starti=starti+1;startj=startj+1;endi=endi-1;endj=endj-1;
            int i=starti,j=startj+rotation,x=starti,y=startj;
            while (true) {

                mat[x][y] = matrix[i][j];

                if(x>starti && y==startj){
                    x--;
                } else if(x<endi && y==endj) {
                    x++;
                } else if(x==endi && y>startj){
                    y--;
                } else {
                    y++;
                }

                if (i == starti && j < endj) {
                    j++;
                } else if (i < endi && j == endj) {
                    i++;
                } else if (i == endi && j > startj) {
                    j--;
                } else if (j == startj && i > starti) {
                    i--;
                }

//                outerLoop.add(matrix[i][j]);
//                if (i < endi && j == endj) {
//                    i++;
//                } else if (j == startj && i > starti) {
//                    i--;
//                } else if (i == starti && j < endj) {
//                    j++;
//                } else if (i == endi && j > startj) {
//                    j--;
//                }

                if (i == starti && j == startj + rotation) {
                    break;
                }
            }
//            starti++;
//            startj++;
//            endi--;
//            endj--;
//            if(starti == 2 && startj == 2){
//                break;
//            }
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