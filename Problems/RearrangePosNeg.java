package Problems;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class RearrangePosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for (int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        RearrangePosNeg rearrangePosNeg = new RearrangePosNeg();
        rearrangePosNeg.rearrangePosNeg(elements,n);
    }

    private void rearrangePosNeg(int[] elements, int n) {
        for (int i=1;i<n;i++){
            if(elements[i]>=0){
                continue;
            }
            int j = i-1;
            while (j>=0 && elements[j]>0){
                int temp = elements[j+1];
                elements[j+1] = elements[j];
                elements[j] = temp;
                j--;
            }
            printArray(elements);
        }
    }

    private void printArray(int[] elements){
        for (int k=0;k<elements.length;k++) {
            System.out.print(elements[k]+ " ");
        }
        System.out.println();
    }
}
