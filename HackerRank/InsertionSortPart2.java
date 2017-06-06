package HackerRank;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class InsertionSortPart2 {
    //TODO
    public static void insertionSortPart2(int[] elements)
    {
        for (int i=1;i<elements.length;i++){
            while (elements[i] < elements[i-1]){
                int temp = elements[i];
                elements[i] = elements[i-1];
                elements[i-1] = temp;
                i--;
                printArray(elements);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);
    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
