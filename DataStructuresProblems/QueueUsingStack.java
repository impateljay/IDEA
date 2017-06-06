package DataStructuresProblems;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class QueueUsingStack {
    private static java.util.Stack<Integer> stack;

    public static void main(String[] args) {
        System.out.print("Enter size of stack ");
        Scanner scanner = new Scanner(System.in);
        int queueSize = scanner.nextInt();
        stack = new Stack<>();
        QueueUsingStack queue = new QueueUsingStack();
        while (true){
            System.out.println("\nSelect operation");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            int op = scanner.nextInt();
            switch (op){
                case 1:
                    System.out.print("Enter element to be inserted ");
                    int ele = scanner.nextInt();
                    queue.enqueue(ele);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
//                    queue.display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }

    private void enqueue(int x){
        stack.push(x);
    }

    private int dequeue(){
        int[] a = new int[stack.size()];
        for (int i=0;i<stack.size()-1;i++){
            a[i] = stack.pop();
        }
        int ret = stack.pop();
        for (int i=0;i<a.length;i++){
            stack.push(a[i]);
        }
        return ret;
    }

    private boolean isEmpty(){
        return stack.isEmpty();
    }
}
