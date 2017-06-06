package Sorting;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for (int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(elements,0,n-1);
        quickSort.printArray(elements);
    }

    private void quickSort(int[] elements,int low, int high){
        if(low < high)
        {
            int q = partition(elements, low, high);
            quickSort(elements, low, q-1);
            quickSort(elements, q+1, high);
        }
    }

    private int partition(int[] elements,int low, int high){
        int pivot = elements[low];
        System.out.println("Pivot : "+pivot);
        int i = low;
        int j = high;
        while(true)
        {
            while(elements[i] < pivot && elements[i] != pivot)
                i++;
            while(elements[j] > pivot && elements[j] != pivot)
                j--;
            if(i < j)
            {
                System.out.println("Swapping "+elements[i]+ " & "+elements[j]);
                int temp = elements[i];
                elements[i] = elements[j];
                elements[j] = temp;
                printArray(elements);
            }
            else
            {
                return j;
            }
        }
    }

    private void printArray(int[] elements){
        for (int k=0;k<elements.length;k++) {
            System.out.print(elements[k]+ " ");
        }
        System.out.println();
    }
}
