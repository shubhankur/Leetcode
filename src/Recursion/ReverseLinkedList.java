package Recursion;

import Collection.ListNode;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode first = head;
        for (int i=2;i>0;i--){
            ListNode temp = new ListNode(i);
            head.next=temp;
            head=temp;
        }
        System.out.println(reverseList(first));
        System.out.println("hello");
    }
}

