package DataStructure;

import java.util.Scanner;

/**
 * Created by Jay Patel on 31/5/17.
 */
public class Stack {

    private int[] stack;
    private int top = -1; //top of stack

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.initialize();
    }

    private void initialize(){
        Scanner scanner = new Scanner(System.in);

        //accept stack size
        while (true){
            System.out.print("Enter size of stack ");
            try {
                int stackSize = scanner.nextInt();
                stack = new int[stackSize];
                printLine();
                break;
            } catch (Exception e){
                System.out.println("Please enter integer"); //if an exception appears prints message
                printLine();
                scanner.next(); // clear scanner wrong input
                continue; // continues to loop if exception is found
            }
        }

        //menu
        while (true){
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek or top");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    try {
                        System.out.print("Enter element to insert ");
                        int element = scanner.nextInt();
                        push(element);
                    } catch (Exception e){
                        System.out.println("Please enter integer");
                        scanner.next();
                        continue;
                    }
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private void push(int element){
        if (isFull()){
            System.out.println("Stack Overflow");
            printLine();
        } else {
            top++;
            stack[top] = element;
            System.out.println(element+" inserted successfully");
            printLine();
        }
    }

    private void pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            printLine();
        } else {
            System.out.println("Popped "+stack[top]);
            top--;
            printLine();
        }
    }

    private void peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            printLine();
        } else {
            System.out.println(stack[top]);
            printLine();
        }
    }

    private void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            printLine();
        } else {
            for (int i=0;i<=top;i++){
                System.out.print(stack[i]+"\t");
            }
            System.out.println();
            printLine();
        }
    }

    private boolean isEmpty(){
        return top < 0;
    }

    private boolean isFull(){
        return top == stack.length;
    }

    private void printLine(){
        System.out.println("----------------------------------------------------------------");
    }
}
