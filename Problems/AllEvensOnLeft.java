package Problems;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class AllEvensOnLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for (int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        AllEvensOnLeft allEvensOnLeft = new AllEvensOnLeft();
        allEvensOnLeft.evensToLeft(elements);
    }

    private void evensToLeft(int[] elements){
        int lastswapposition = -1;
        for (int i=0;i<elements.length;i++){
            if(elements[i]%2==0){
                lastswapposition++;
                int temp = elements[lastswapposition];
                elements[lastswapposition] = elements[i];
                elements[i] = temp;
                printArray(elements);
            }
        }
        printArray(elements);
    }

    private void printArray(int[] element){
        for (int i=0;i<element.length;i++){
            System.out.print(element[i]+" ");
        }
        System.out.println();
    }
}