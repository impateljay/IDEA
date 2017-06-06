package DataStructures;

import java.util.Scanner;

/**
 * Created by Jay Patel on 18/4/17.
 */
public class Queue {
    private static int[] queue;
    private static int front;
    private static int rear;

    public static void main(String[] args) {
        System.out.print("Enter size of stack ");
        Scanner scanner = new Scanner(System.in);
        int queueSize = scanner.nextInt();
        queue = new int[queueSize];
        front = 0;
        rear = 0;
        Queue queue = new Queue();
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
                    queue.display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }

    private void enqueue(int element){
        if(front>=queue.length){
            System.out.println("Overflow");
        } else {
            queue[front++] = element;
            System.out.println("inserted successfully");
        }
    }

    private void dequeue(){
        if(rear<front){
            System.out.println("removed "+queue[rear]+" from queue");
            rear++;
            if(rear>=front){
                front=0;
                rear=0;
            }
        } else {
            System.out.println("Underflow");
        }
    }

    private void display(){
        for (int i=rear;i<front;i++){
            System.out.print(queue[i]+" ");
        }
    }
}
