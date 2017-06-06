package Problems;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class GetAllSubsetByStack {
    private static final int[] DATA = { 1, 3, 4, 5, 6, 2, 7, 8, 9, 10, 11, 13, 14, 15 };
    /** Set a value for target sum */
    public static int TARGET_SUM = 15;
    private Stack<Integer> stack = new Stack<Integer>();
    /** Store the sum of current elements stored in stack */
    private int sumInStack = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];
        for(int i=0;i<n;i++){
            elements[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();
        GetAllSubsetByStack get = new GetAllSubsetByStack();
        get.populateSubset(elements, 0, elements.length, sum);
    }

    public void populateSubset(int[] data, int fromIndex, int endIndex, int sum) {
        /*
        * Check if sum of elements stored in Stack is equal to the expected
        * target sum.
        *
        * If so, call print method to print the candidate satisfied result.
        */
        if (sumInStack == sum) {
            print(stack);
        }
        for (int currentIndex = fromIndex; currentIndex < endIndex; currentIndex++) {
            if (sumInStack + data[currentIndex] <= sum) {
                stack.push(data[currentIndex]);
                sumInStack += data[currentIndex];
                /*
                * Make the currentIndex +1, and then use recursion to proceed
                * further.
                */
                populateSubset(data, currentIndex + 1, endIndex, sum);
                sumInStack -= (Integer) stack.pop();
            }
        }
    }

    private void print(Stack<Integer> stack) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Integer i : stack) {
            sb.append(i).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        System.out.println(sb.toString());
    }
}