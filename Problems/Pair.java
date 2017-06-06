package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class Pair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for (int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();
        Pair pair = new Pair();
//        pair.sort(elements,0,n-1,sum);
        pair.pair(elements,sum);
    }

    private void sort(int[] elements,int low,int high,int sum){
        if(low < high)
        {
            int q = partition(elements, low, high);
            sort(elements, low, q-1,sum);
            sort(elements, q+1, high,sum);
            pair(elements,sum);
        }
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

    private void pair(int[] elements,int sum){
        List<Integer> addition = new ArrayList<>();
        int add=0;
        for (int i=0;i<elements.length-1;i++){
            addition.clear();
            addition.add(elements[i]);
            add=elements[i];
            for (int j=0;j<elements.length;j++){
                if(j!=i){
                    if(add+elements[j]==sum){
                        add = add + elements[j];
                        addition.add(elements[j]);
                        printPair(addition);
                        addition.clear();
                        add=0;
                    }
//                    else if (add + elements[j] < sum) {
//                        add = add + elements[j];
//                        addition.add(elements[j]);
//                    } else {
//                        break;
//                    }
                }
            }

//            while (add<=sum){
//                if(j!=i) {
//                    if (add + elements[j] == sum) {
//                        add = add + elements[j];
//                        addition.add(elements[j]);
//                        printPair(addition);
//                        break;
//                    } else if (add + elements[j] < sum) {
//                        add = add + elements[j];
//                        addition.add(elements[j]);
////                        break;
//                    } else {
//                        break;
//                    }
//                    j++;
//                } else {
//                    j++;
//                }
//            }
        }
    }

    private void printPair(List<Integer> list){
        for (int i:list) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
