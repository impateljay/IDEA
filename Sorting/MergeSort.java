package Sorting;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for(int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(elements,0,elements.length-1);
    }

    private void sort(int[] elements, int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            sort(elements,low,mid);
            sort(elements,mid+1,high);
            merge(elements,low,mid,high);
        }
    }

    private void merge(int[] elements,int low, int mid, int high){
        int n1=mid-low+1;
        int n2=high-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i=0;i<n1;i++){
            left[i] = elements[low+i];
        }
        for (int i=0;i<n2;i++){
            right[i] = elements[mid+1+i];
        }

        int i=0,j=0,k=low;

        while (i<n1 && j<n2){
            if(left[i] <= right[j]){
                elements[k] = left[i];
                i++;
            } else {
                elements[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            elements[k] = left[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            elements[k] = right[j];
            j++;
            k++;
        }
        printArray(elements);
    }

    private void printArray(int[] elements){
        for (int i=0;i<elements.length;i++){
            System.out.print(elements[i]+" ");
        }
        System.out.println();
    }
}
