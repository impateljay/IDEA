package Problems;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class RearrangePosNegBetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for (int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        RearrangePosNegBetter rearrangePosNegBetter = new RearrangePosNegBetter();
        rearrangePosNegBetter.rearrangePosNegBetter(elements,0,n-1);
    }

    private void rearrangePosNegBetter(int[] elements, int low, int high) {
        if(low<high){
            int mid = (low+high)/2;
            rearrangePosNegBetter(elements,low,mid);
            rearrangePosNegBetter(elements,mid+1,high);
            merge(elements,low,mid,high);
        }
    }

    private void merge(int[] elements, int low, int mid, int high) {
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

        while (i<n1&&left[i]<0){
            elements[k]=left[i];
            k++;
            i++;
        }

        while (j<n2&&right[j]<0){
            elements[k]=right[j];
            k++;
            j++;
        }

        while (i<n1){
            elements[k]=left[i];
            k++;
            i++;
        }

        while (j<n2){
            elements[k]=right[j];
            k++;
            j++;
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
