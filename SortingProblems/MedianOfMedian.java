package SortingProblems;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class MedianOfMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for (int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
//            elements[i] = (int)(100*Math.random());
        }
        printArray(elements);
        MedianOfMedian medianOfMedian = new MedianOfMedian();
        int[][] matrix = medianOfMedian.createSublists(elements,5);
//        medianOfMedian.sort(matrix);
    }

//    private void sort(int[][] matrix){
////        for (int i=0;i<matrix.length;i++) {
//            for (int row = 0; row < matrix.length; row++) {
//                int[] a = new int[matrix[row].length];
//                for (int column = 0; column < matrix[row].length; column++) {
//                    a[column] = matrix[row][column];
//                }
//                int[] sortedArray = quickSort(a,0,a.length-1);
//                for (int i=0;i<sortedArray.length;i++){
//                    matrix[row][i]=sortedArray[i];
//                }
//                System.out.println("Median"+row+" "+sortedArray[sortedArray.length/2]);
//                printArray(a);
//            }
//            printMatrix(matrix);
////        }
//    }

//    private void sort(int[] elements,int low, int high){
////        for (int i=0;i<matrix.length;i++) {
//        for (int row = 0; row < matrix.length; row++) {
//            int[] a = new int[matrix[row].length];
//            for (int column = 0; column < matrix[row].length; column++) {
//                a[column] = matrix[row][column];
//            }
//            int[] sortedArray = quickSort(a,0,a.length-1);
//            for (int i=0;i<sortedArray.length;i++){
//                matrix[row][i]=sortedArray[i];
//            }
//            System.out.println("Median"+row+" "+sortedArray[sortedArray.length/2]);
//            printArray(a);
//        }
//        printMatrix(matrix);
////        }
//    }

    private int[][] createSublists(int[] elements,int n) {
        int[][] matrix = new int[(int) Math.ceil((double) elements.length/(double)n)][n];
        int start=0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            if(start + n > elements.length) {
                matrix[i] = new int[elements.length-start];
                int[] a = new int[elements.length-start];
                System.arraycopy(elements, start, a, 0, elements.length - start);
                int[] sortedArray = quickSort(a,0,a.length-1);
                //System.arraycopy(sortedArray,0,elements,start,a.length);
                printArray(sortedArray);
                arrayList.add(sortedArray[sortedArray.length/2]);
            }
            else {
                matrix[i] = new int[n];
                int[] a = new int[n];
                System.arraycopy(elements, start, a, 0, n);
                int[] sortedArray = quickSort(a,0,a.length-1);
                //System.arraycopy(sortedArray,0,elements,start,a.length);
                printArray(sortedArray);
                arrayList.add(sortedArray[sortedArray.length/2]);
            }
            start += n ;
        }
        System.out.println();
        //printArray(elements);
        System.out.println("Mean Array");
        int[] intArray = new int[arrayList.size()];
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(arrayList.get(i)+" ");
            intArray[i] = arrayList.get(i);
        }
        System.out.println("Sorted Mean Array");
        int[] sortedMedianArray = quickSort(intArray,0,intArray.length-1);
        for (int i = 0; i < sortedMedianArray.length; i++) {
            System.out.println(sortedMedianArray[i]+" ");
        }
        System.out.println("\nMedian of Median : "+sortedMedianArray[sortedMedianArray.length/2]);
        return matrix;
    }

    private void printMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static void printArray(int arr[])
    {
        System.out.print("[  ");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("]");
    }

    public int[] quickSort(int[] elements,int low, int high){
        if(low < high)
        {
            int q = partition(elements, low, high);
            quickSort(elements, low, q);
            quickSort(elements, q+1, high);
        }
        return elements;
    }

    private int partition(int[] elements,int low, int high){
        int pivot = elements[low];
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
                int temp = elements[i];
                elements[i] = elements[j];
                elements[j] = temp;
            }
            else
            {
                return j;
            }
        }
    }
}
