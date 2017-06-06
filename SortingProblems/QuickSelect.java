package SortingProblems;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
//Program to find kth smallest element
public class QuickSelect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        QuickSelect quickSelect = new QuickSelect();
        int kthsmallest = quickSelect.quickSelect(elements, 0, elements.length - 1, k - 1);
        System.out.println(k + "th Smallest element : " + kthsmallest);
    }

    private int quickSelect(int items[], int first, int last, int k) {
        if (first == last) {
            return items[first];
        }
        int pivot = 0;
        while (last >= first) {
            pivot = partition(items, first, last);
            if (pivot == k) {
                return items[pivot];
            } else if (pivot < k) {
                first = pivot + 1;
            } else {
                last = pivot - 1;
            }
        }
        return items[pivot];
    }


    private int partition(int[] elements, int low, int high) {
        int pivot = elements[low];
        System.out.println("Pivot : " + pivot);
        int i = low;
        int j = high;
        while (true) {
            while (elements[i] < pivot && elements[i] != pivot)
                i++;
            while (elements[j] > pivot && elements[j] != pivot)
                j--;
            if (i < j) {
                System.out.println("Swapping " + elements[i] + " & " + elements[j]);
                int temp = elements[i];
                elements[i] = elements[j];
                elements[j] = temp;
                i++;
                printArray(elements);
            } else {
                return j;
            }
        }
    }

    private void printArray(int[] elements) {
        for (int k = 0; k < elements.length; k++) {
            System.out.print(elements[k] + " ");
        }
        System.out.println();
    }
}
