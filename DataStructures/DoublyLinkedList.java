package DataStructures;

import java.util.Scanner;

/**
 * Created by Jay Patel on 20/4/17.
 */
public class DoublyLinkedList {
    private static class Node{
        int value;
        Node next;
        Node prev;
    }

    private static Node head;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        head = new Node();
        head.value=Integer.MIN_VALUE;
        head.prev = null;
        head.next = null;
        DoublyLinkedList linkedList = new DoublyLinkedList();
        while (true) {
            System.out.println("\nSelect operation");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter element to be inserted ");
                    int ele = scanner.nextInt();
                    linkedList.insert(ele);
                    break;
                case 2:
                    System.out.println("Enter position of element to be deleted");
                    int pos = scanner.nextInt();
                    linkedList.delete(pos);
                    break;
                case 3:
                    linkedList.display();
                    break;
                case 4:
                    System.out.println("Enter element to be searched");
                    int e = scanner.nextInt();
                    linkedList.search(e);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }

    private void insert(int element){
        Node node = head;
        while (node.next!=null){
            node = node.next;
        }
        Node newNode = new Node();
        newNode.value = element;
        newNode.prev = node;
        newNode.next = null;
        node.next = newNode;
        System.out.println("inserted sucessfully");
    }

    private void delete(int position){
        Node node = head;
        int i=0;
        while (i<position-1){
            if(node.next == null){
                System.out.println("position not found");
                return;
            }
            node = node.next;
            i++;
        }
        if(node.next != null) {
            Node toBeDeleted = node.next;
            node.next = toBeDeleted.next;
            toBeDeleted.prev.next = toBeDeleted.next;
            System.out.println("delete sucessful");
        } else {
            System.out.println("position not found");
        }
    }

    private void display(){
        Node node = head;
        while (node.next!=null){
            node = node.next;
            System.out.print(node.value+" ");
        }
        System.out.println();
    }

    private void search(int element){
        Node node = head;
        int i=0;
        while (node.next != head ){
            if(node.value==element){
                System.out.println("Element "+element+" found at position "+i++);
                return;
            } else {
                node = node.next;
                i++;
            }
        }
        if(node.value==element){
            System.out.println("Element "+element+" found at position "+i++);
        } else {
            System.out.println("Element not found");
        }
    }
}