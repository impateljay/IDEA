package LeetCode;

import java.util.Scanner;

/**
 * Created by Jay Patel on 17/4/17.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListNode first1Node;
        ListNode first2Node;
        ListNode first3Node;
        ListNode second1Node;
        ListNode second2Node;
        ListNode second3Node;
        first1Node = new ListNode(0);
//        first1Node = new ListNode(scanner.nextInt());
//        first2Node = new ListNode(scanner.nextInt());
//        first3Node = new ListNode(scanner.nextInt());
        second1Node = new ListNode(0);
//        second1Node = new ListNode(scanner.nextInt());
//        second2Node = new ListNode(scanner.nextInt());
//        second3Node = new ListNode(scanner.nextInt());
//        first1Node.next = first2Node;
//        first2Node.next = first3Node;
//        first3Node.next = null;
//        second1Node.next = second2Node;
//        second2Node.next = second3Node;
//        second3Node.next = null;
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(first1Node,second1Node);
    }

     private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result;
        ListNode result1;
        ListNode result2;
        ListNode result3;
        ListNode result4;
        int carry = 0;
        int sum = 0;

        sum = l1.val + l2.val;
        if(sum+carry>9) {
            result = new ListNode((sum+carry)%10);
            carry = (sum+carry)/10;
        } else {
            result = new ListNode(sum+carry);
            carry = 0;
        }
        System.out.print(result.val+" ");
        result1 = result;
        result.next = result1;
        result2 = result;
        while (l1.next != null && l2.next != null){
            result1 = result2;
            if(l1.next == null){
                l1.val =0;
            } else {
                l1 = l1.next;
            }
            if(l2.next == null){
                l2.val =0;
            } else {
                l2 = l2.next;
            }
            sum = l1.val + l2.val;
            if(sum+carry>9) {
                result2 = new ListNode((sum+carry)%10);
                carry = (sum+carry)/10;
            } else {
                result2 = new ListNode(sum+carry);
                carry = 0;
            }
            System.out.print(result2.val+" ");
            result1.next = result2;
        }

//        sum = l1.val + l2.val;
//        if(sum+carry>9) {
//            result1 = new ListNode((sum+carry)%10);
//            carry = (sum+carry)/10;
//        } else {
//            result1 = new ListNode(sum+carry);
//            carry = 0;
//        }
//        System.out.print(result1.val);
//        l1 = l1.next;
//        l2 = l2.next;
//        sum = l1.val + l2.val;
//        if(sum+carry>9) {
//            result2 = new ListNode((sum+carry)%10);
//            carry = (sum+carry)/10;
//        } else {
//            result2 = new ListNode(sum+carry);
//            carry = 0;
//        }
//        result1.next = result2;
////        System.out.print(result2.val);
//        l1 = l1.next;
//        l2 = l2.next;
//        sum = l1.val + l2.val;
//        if(sum+carry>9) {
//            result3 = new ListNode((sum+carry)%10);
//            carry = (sum+carry)/10;
//        } else {
//            result3 = new ListNode(sum+carry);
//            carry = 0;
//        }
//        result2.next = result3;
//        System.out.print(result3.val);
//
        if(carry!=0){
            result4 = new ListNode(carry);
            result2.next = result4;
            System.out.print(result4.val+" ");
        }

        return result;
    }
}
