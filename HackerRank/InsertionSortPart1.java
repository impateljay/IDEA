package HackerRank;

import Sorting.InsertionSort;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class InsertionSortPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for (int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        InsertionSortPart1 insertionSort = new InsertionSortPart1();
        insertionSort.insertionSort(elements,n);
    }

    private void insertionSort(int[] elements, int n) {
        for (int i=1;i<n;i++){
            while (i>0 && elements[i] < elements[i-1]){
                int temp = elements[i];
                elements[i] = elements[i-1];
                printArray(elements);
                elements[i-1] = temp;
                i--;
            }
        }
        printArray(elements);
    }

    private void printArray(int[] elements){
        for (int k=0;k<elements.length;k++) {
            System.out.print(elements[k]+ " ");
        }
        System.out.println();
    }
}
