package Sorting;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for (int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(elements,n);
    }

    private void selectionSort(int[] elements, int n){
        int m;
        for (int i=0;i<n-1;i++){
            m=i;
            for (int j=i;j<n;j++){
                if(elements[m]>elements[j]){
                    m=j;
                }
            }
            if(m!=i) {
                int temp = elements[i];
                elements[i] = elements[m];
                elements[m] = temp;
            }
            for (int k=0;k<n;k++){
                System.out.print(elements[k]+ " ");
            }
            System.out.println();
        }
    }
}
