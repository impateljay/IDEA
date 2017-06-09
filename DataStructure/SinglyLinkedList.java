package DataStructure;

import java.util.Scanner;

/**
 * Created by Jay Patel on 5/6/17.
 */
public class SinglyLinkedList {

    private Node head;

    private class Node{
        int value;
        Node next;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.initialize();
    }

    private void initialize(){
        Scanner scanner = new Scanner(System.in);

        //menu
        while (true){
            System.out.println("1.Insert new element at the beginning");
            System.out.println("2.Insert new element at the end");
            System.out.println("3.Insert new element at position");
            System.out.println("4.Delete element from the beginning");
            System.out.println("5.Delete element from the end");
            System.out.println("6.Delete element with value");
            System.out.println("7.Delete element with position");
            System.out.println("8.Show element at desired position");
            System.out.println("9.Display the list");
            System.out.println("10.Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    try {
                        System.out.print("Enter element to insert ");
                        int element = scanner.nextInt();
                        insertAtBeginning(element);
                    } catch (Exception e){
                        System.out.println("Please enter integer");
                        scanner.next();
                        continue;
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter element to insert ");
                        int element = scanner.nextInt();
                        insertAtEnd(element);
                    } catch (Exception e){
                        System.out.println("Please enter integer");
                        scanner.next();
                        continue;
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Enter element to insert ");
                        int element = scanner.nextInt();
                        System.out.print("Enter position ");
                        int position = scanner.nextInt();
                        insertAt(element, position);
                    } catch (Exception e){
                        System.out.println("Please enter integer");
                        scanner.next();
                        continue;
                    }
                    break;
                case 4:
                    deleteFromBeginning();
                    break;
                case 5:
                    deleteFromEnd();
                    break;
                case 6:
                    try {
                        System.out.print("Enter element to be deleted");
                        int element = scanner.nextInt();
                        deleteWithValue(element);
                    } catch (Exception e){
                        System.out.println("Please enter integer");
                        scanner.next();
                        continue;
                    }
                    break;
                case 7:
                    try {
                        System.out.print("Enter position of element to be deleted");
                        int position = scanner.nextInt();
                        deleteWithPosition(position);
                    } catch (Exception e){
                        System.out.println("Please enter integer");
                        scanner.next();
                        continue;
                    }
                    break;
                case 8:
                    try {
                        System.out.print("Enter position of element to be deleted");
                        int position = scanner.nextInt();
                        findElementAtPosition(position);
                    } catch (Exception e){
                        System.out.println("Please enter integer");
                        scanner.next();
                        continue;
                    }
                    break;
                case 9:
                    display();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    printLine();
                    break;
            }
        }
    }

    private void insertAtBeginning(int element) {
        Node newNode = new Node();
        newNode.value = element;
        if(head != null){
            newNode.next = head.next;
        }
        head = newNode;
        System.out.println("Inserted "+element+" successfuly");
        printLine();
    }

    private void insertAtEnd(int element) {
        Node node = head;
        Node newNode = new Node();
        newNode.value = element;
        if(node != null){
            while (node.next != null){
                node = node.next;
            }
            node.next = newNode;
        } else {
            head = newNode;
        }
        System.out.println("Inserted "+element+" successfuly");
        printLine();
    }

    private void insertAt(int element, int position) {
        Node node = head;
        Node newNode = new Node();
        newNode.value = element;
        if(node != null){
            for (int i=0;i<position-2;i++){
                if(node.next!=null){
                    node = node.next;
                } else {
                    System.out.println("Not enough node in the list");
                    printLine();
                    return;
                }
            }
            newNode.next = node.next;
            node.next = newNode;
            System.out.println("Inserted "+element+" successfuly");
            printLine();
        } else {
            System.out.println("Not enough node in the list");
            printLine();
        }
    }

    private void deleteFromBeginning(){
        if(head != null) {
            head = head.next;
        } else {
            System.out.println("Not enough node in the list");
            printLine();
        }
    }

    private void deleteFromEnd(){
        Node node = head;
        if(node != null){
            while (node.next.next != null){
                node = node.next;
            }
            node.next = null;
        } else {
            System.out.println("No nodes found");
            printLine();
        }
    }

    private void deleteWithValue(int element){
        Node node = head;
        if(node != null){
            while (node.next != null && node.next.value != element){
                node = node.next;
            }
            if(node.next != null && node.next.value == element){
                node.next = node.next.next;
            } else {
                System.out.println("Element not found");
                printLine();
            }
        } else {
            System.out.println("Element not found");
            printLine();
        }
    }

    private void deleteWithPosition(int position){
        Node node = head;
        if(node != null){
            for (int i=0;i<position-2;i++){
                node = node.next;
            }
            if(node != null){
                node.next = node.next.next;
            } else {
                System.out.println("Not enough node in the list");
                printLine();
            }
        } else {
            System.out.println("Not enough node in the list");
            printLine();
        }
    }

    private void findElementAtPosition(int position){
        Node node = head;
        if(node != null){
            for (int i=0;i<position-1;i++){
                node = node.next;
            }
            if(node != null){
                System.out.println("found "+node.value+" at position "+position);
                printLine();
            } else {
                System.out.println("Not enough node in the list");
                printLine();
            }
        } else {
            System.out.println("Not enough node in the list");
            printLine();
        }
    }

    private void display(){
        printLine();
        Node node = head;
        if(node != null) {
            while (node != null) {
                System.out.print(node.value + "\t");
                node = node.next;
            }
        } else {
            System.out.println("No elements found");
        }
        printLine();
    }

    private void printLine(){
        System.out.println("----------------------------------------------------------------");
    }
}
