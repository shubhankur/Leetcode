package LinkedList;

import Collection.ListNode;
import Helper.CreateLinkedList;
import Helper.PrintLinkedList;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode node = null, copy = head;
        while(copy!=null){
            copy = copy.next;
            head.next = node;
            node = head;
            if(copy!=null)
            head = copy;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head  = CreateLinkedList.createList(new int[]{1,2,3,4,5});
        PrintLinkedList.printList(head);
        head = reverseList(head);
        PrintLinkedList.printList(head);
    }
}
