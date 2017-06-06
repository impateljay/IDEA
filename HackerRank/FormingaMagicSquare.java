package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 20/4/17.
 */
public class FormingaMagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
}
