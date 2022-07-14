package LinkedList;

import Collection.ListNode;
import Helper.CreateLinkedList;
import Helper.PrintLinkedList;

import java.util.Objects;

public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode copy = head;
        int length = 0; //2
        while (copy != null) {
            length++;
            copy = copy.next;
        }
        if (n == length) return head.next;
        int c = 0;
        copy = head;
        while (copy != null) {
            if (c == length - n - 1) copy.next = copy.next.next;
            c++;
            copy = copy.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = CreateLinkedList.createList(new int[]{1,2});
        PrintLinkedList.printList(head);
        head = removeNthFromEnd(head,1);
        PrintLinkedList.printList(head);

    }
}
