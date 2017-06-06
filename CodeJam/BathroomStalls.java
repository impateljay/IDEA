package CodeJam;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Jay Patel on 13/4/17.
 */
public class BathroomStalls {
    private Node head;
    private Node tail;
    private static PrintWriter writer = null;
    int testCaseNum=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] n = new int[t];
        int[] k = new int[t];
        for (int i=0;i<t;i++){
            n[i] = scanner.nextInt();
            k[i] = scanner.nextInt();
        }
        try{
            writer = new PrintWriter("C-small-practice-2.txt", "UTF-8");
        } catch (IOException e) {
            // do something
        }
        BathroomStalls bathroomStalls = new BathroomStalls();
        bathroomStalls.solution(n,k,t);
        writer.close();
    }

    private void solution(int[] n, int[] k, int t){
        for (int i=0;i<t;i++) {
            head = new Node();
            head.value = 0;
            head.prev = null;
            tail = new Node();
            tail.value = n[i]+1;
            tail.prev = head;
            tail.next = null;
            head.next = tail;
//            insertNode(7);
//            insertNode(3);
//            insertNode(12);
            findPositionToInsert(k[i]);
        }
    }

    private void findPositionToInsert(int k){
        for (int i=0;i<k;i++) {
            Node node = head;
            int firstValue = -1, secondValue = -1, maxDistance = 0, maxFirstValue = -1, maxSecondValue = -1;
//        System.out.println();
            while (node.next != null) {
                firstValue = node.value;
                node = node.next;
                secondValue = node.value;
//            System.out.println(firstValue+"\t"+secondValue);
                if (maxDistance < secondValue - firstValue - 1) {
                    maxDistance = secondValue - firstValue - 1;
                    maxFirstValue = firstValue;
                    maxSecondValue = secondValue;
                }
            }
//            System.out.println(maxFirstValue + "\t" + maxSecondValue);
//            System.out.println("inserted at "+(maxFirstValue + maxSecondValue) / 2);
            insertNode((maxFirstValue + maxSecondValue) / 2,i==k-1);
        }
    }

    private void insertNode(int value, boolean print){
        Node newNode;
        //start form head & insert
        if(value-head.value<tail.value-value){
            Node node = head;
            while (value>node.value){
                node = node.next;
            }
            newNode = new Node();
            newNode.value = value;
            newNode.next = node;
            newNode.prev = node.prev;
            node.prev.next = newNode;
            node.prev = newNode;
        }
        // start from tail & insert
        else {
            Node node = tail;
            while (value<node.value){
                node = node.prev;
            }
            newNode = new Node();
            newNode.value = value;
            newNode.prev = node;
            newNode.next = node.next;
            node.next.prev = newNode;
            node.next = newNode;
        }

        if(print){
            int prv = newNode.prev.value;
            int nxt = newNode.next.value;
            int left = newNode.value - prv - 1;
            int right = nxt - newNode.value - 1;

            testCaseNum++;
            if(left>right){
                writer.println("Case #"+testCaseNum+": "+ left+" "+right);
                System.out.println("Case #"+testCaseNum+": "+ left+" "+right);
            } else {
                writer.println("Case #"+testCaseNum+": "+ right+" "+left);
                System.out.println("Case #"+testCaseNum+": "+ right+" "+left);
            }
        }

//        Node node = head;
//        while (true){
//            if(node.next!=null){
//                System.out.print(node.value+"\t");
//                node = node.next;
//            } else {
//                System.out.print(node.value+"\t");
//                break;
//            }
//        }

    }

    private static class Node{
        int value;
        Node next;
        Node prev;
    }
}
