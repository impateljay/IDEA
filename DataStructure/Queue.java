package DataStructure;

import java.util.Scanner;

/**
 * Created by Jay Patel on 1/6/17.
 */
public class Queue {

    private int[] queue;
    private int front = -1; //remove
    private int rear = -1; //insert

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.initialize();
    }

    private void initialize(){
        Scanner scanner = new Scanner(System.in);

        //accept queue size
        while (true){
            System.out.print("Enter size of queue ");
            try {
                int queueSize = scanner.nextInt();
                queue = new int[queueSize];
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
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Front");
            System.out.println("4.Rear");
            System.out.println("5.Display");
            System.out.println("6.Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    try {
                        System.out.print("Enter element to insert ");
                        int element = scanner.nextInt();
                        enqueue(element);
                    } catch (Exception e){
                        System.out.println("Please enter integer");
                        scanner.next();
                        continue;
                    }
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    front();
                    break;
                case 4:
                    rear();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    printLine();
                    break;
            }
        }
    }

    private void enqueue(int element){
        if (isFull()){
            System.out.println("Queue is full");
            printLine();
        } else {
            if(rear < queue.length-1) {
                if (front == -1) {
                    front++;
                }
                rear++;
            }
            queue[rear] = element;
            System.out.println(element+" inserted successfully");
            printLine();
        }
    }

    private void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            printLine();
        } else {
            System.out.println("Popped "+queue[front]);
            front++;
            printLine();
        }
    }

    private void front(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            printLine();
        } else {
            System.out.println("Front : "+queue[front]);
            printLine();
        }
    }

    private void rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            printLine();
        } else {
            System.out.println("Rear : "+queue[rear]);
            printLine();
        }
    }

    private void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            printLine();
        } else {
            for (int i=front;i<=rear;i++){
                System.out.print(queue[i]+"\t");
            }
            System.out.println();
            printLine();
        }
    }

    private boolean isEmpty(){
        return front > rear || rear == -1;
    }

    private boolean isFull(){
        return rear == queue.length - 1;
    }

    private void printLine(){
        System.out.println("----------------------------------------------------------------");
    }
}
