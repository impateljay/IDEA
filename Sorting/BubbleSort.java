package Sorting;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for (int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(elements);
    }

    private void bubbleSort(int[] elements){
        int n = elements.length;
        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(elements[j+1] < elements[j]){
                    //swap elements[j+1] & elements[j]
                    int temp = elements[j+1];
                    elements[j+1] = elements[j];
                    elements[j] = temp;
                }
            }
            System.out.println("After Iteration "+ i);
            printArray(elements);
            System.out.println();
        }
        System.out.println();
        System.out.println("Final Result");
        printArray(elements);
    }

    private void printArray(int[] elements){
        for (int k=0;k<elements.length;k++) {
            System.out.print(elements[k]+ " ");
        }
    }
}
