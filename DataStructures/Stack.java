package DataStructures;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class Stack {
    private static int[] stack;
    private static int top;

    public static void main(String[] args) {
        System.out.print("Enter size of stack ");
        Scanner scanner = new Scanner(System.in);
        int stackSize = scanner.nextInt();
        stack = new int[stackSize];
        top = -1;
        Stack stack = new Stack();
        while (true){
            System.out.println("\nSelect operation");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. IsEmpty");
            System.out.println("4. Exit");
            int op = scanner.nextInt();
            switch (op){
                case 1:
                    System.out.print("Enter element to be inserted ");
                    int ele = scanner.nextInt();
                    stack.push(ele);
                    break;
                case 2:
                    int element = stack.pop();
                    if(element!=Integer.MIN_VALUE) {
                        System.out.println("Popped element is :" + element);
                    }
                    break;
                case 3:
                    if(stack.isEmpty()){
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }

    private void push(int element){
        if(top>=stack.length-1){
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] =element;
            System.out.println("Element inserted");
        }
    }

    private int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        } else {
            int element = stack[top];
            top--;
            return element;
        }
    }

    private boolean isEmpty(){
        return top<0;
    }

}
