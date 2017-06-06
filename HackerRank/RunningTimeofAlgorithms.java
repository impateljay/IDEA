package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 19/4/17.
 */
public class RunningTimeofAlgorithms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for (int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        RunningTimeofAlgorithms insertionSort = new RunningTimeofAlgorithms();
        insertionSort.insertionSort(elements,n);
    }

    private void insertionSort(int[] elements, int n) {
        int count=0;
        for (int i=1;i<n;i++){
            while (i>0 && elements[i] < elements[i-1]){
                int temp = elements[i-1];
                elements[i-1] = elements[i];
                elements[i] = temp;
                i--;
                count++;
            }
        }
        System.out.println(count);
    }

    private void printArray(int[] elements){
        for (int k=0;k<elements.length;k++) {
            System.out.print(elements[k]+ " ");
        }
        System.out.println();
    }
}
