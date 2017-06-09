package DataStructure;

import java.util.Scanner;

/**
 * Created by Jay Patel on 9/6/17.
 */
public class DoublyLinkedList {

    private Node head;

    private class Node{
        int value;
        Node prev;
        Node next;
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.initialize();
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
                        if (position <= 0){
                            printLine();
                            System.out.println("Please enter valid position");
                            printLine();
                            continue;
                        }
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
                        if (position <= 0){
                            printLine();
                            System.out.println("Please enter valid position");
                            printLine();
                            continue;
                        }
                        deleteWithPosition(position);
                    } catch (Exception e){
                        System.out.println("Please enter integer");
                        scanner.next();
                        continue;
                    }
                    break;
                case 8:
                    try {
                        System.out.print("Enter position of element to find");
                        int position = scanner.nextInt();
                        if (position <= 0){
                            printLine();
                            System.out.println("Please enter valid position");
                            printLine();
                            continue;
                        }
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
        if(head == null){
            head = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        printLine();
        System.out.println("Inserted "+element+" successfuly");
        printLine();
    }

    private void insertAtEnd(int element) {
        Node newNode = new Node();
        newNode.value = element;
        if (head == null){
            head = newNode;
        } else {
            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = newNode;
            newNode.prev = node;
        }
        printLine();
        System.out.println("Inserted "+element+" successfuly");
        printLine();
    }

    private void insertAt(int element, int position) {
        printLine();
        if(position == 1){
            Node newNode = new Node();
            newNode.value = element;
            if(head != null) {
                newNode.next = head;
            }
            head = newNode;
            System.out.println("Inserted "+element+" successfuly");
            return;
        }
        Node node = head;
        if(node == null){
            System.out.println("Not enough node in the list");
        } else {
            for (int i=0;i<position-2;i++){
                if(node != null){
                    node = node.next;
                } else {
                    System.out.println("Not enough node in the list");
                    return;
                }
            }
            Node newNode = new Node();
            newNode.value = element;
            newNode.next = node.next;
            newNode.prev = node;
            if(node.next != null) {
                node.next.prev = newNode;
            }
            node.next = newNode;
        }
        printLine();
    }

    private void deleteFromBeginning(){
        printLine();
        if(head != null) {
            System.out.println("Deleted "+head.value);
            head = head.next;
            if(head != null) {
                head.prev = null;
            }
        } else {
            System.out.println("Not enough node in the list");
        }
        printLine();
    }

    private void deleteFromEnd(){
        printLine();
        Node node = head;
        if(node != null){
            if(node.next != null) {
                while (node.next.next != null) {
                    node = node.next;
                }
                System.out.println("Deleted " + node.next.value);
                node.next = null;
            } else {
                System.out.println("Deleted " + head.value);
                head = null;
            }
        } else {
            System.out.println("No nodes found");
        }
        printLine();
    }

    private void deleteWithValue(int element) {
        printLine();
        Node node = head;
        if (node != null) {
            while (node != null) {
                if (node.value == element) {
                    System.out.println("Deleted " + element);
                    if (node.next != null) {
                        node.prev.next = node.next;
                        node.next.prev = node.prev;
                    } else {
                        node.prev.next = null;
                    }
                    return;
                }
                node = node.next;
            }
            System.out.println("Element not found");
        } else {
            System.out.println("Element not found");
        }
        printLine();
    }

    private void deleteWithPosition(int position){
        printLine();
        if(position == 1){
            if(head == null){
                System.out.println("Not enough node in the list");
            } else {
                System.out.println("Deleted " + head.value);
                head = head.next;
            }
            return;
        } else {
            Node node = head;
            if (node != null) {
                for (int i = 0; i < position - 1; i++) {
                    if (node == null) {
                        System.out.println("Not enough node in the list");
                        return;
                    }
                    node = node.next;
                }
                if(node != null) {
                    System.out.println("Deleted " + node.value);
                    if (node.prev != null) {
                        node.prev.next = node.next;
                    }
                    if (node.next != null) {
                        node.next.prev = node.prev;
                    }
                } else {
                    System.out.println("Not enough node in the list");
                }
            } else {
                System.out.println("Not enough node in the list");
            }
        }
        printLine();
    }

    private void findElementAtPosition(int position){
        printLine();
        Node node = head;
        if(node != null){
            for (int i=0;i<position-1;i++){
                node = node.next;
            }
            if(node != null){
                System.out.println("found "+node.value+" at position "+position);
            } else {
                System.out.println("Not enough node in the list");
            }
        } else {
            System.out.println("Not enough node in the list");
        }
        printLine();
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
            System.out.print("No elements found");
        }
        System.out.println();
        printLine();
    }

    private void printLine(){
        System.out.println("----------------------------------------------------------------");
    }
}
