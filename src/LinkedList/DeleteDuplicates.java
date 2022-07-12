package LinkedList;

import Collection.ListNode;
import Helper.CreateLinkedList;
import Helper.PrintLinkedList;

public class DeleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode p = deleteDuplicates(head.next);
        if(p!=null && p.val == head.val) {
            head.next =  head.next.next;
        }
        else{
            head.next = p;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = CreateLinkedList.createList(new int[]{1,1,1,2,2,2});
        PrintLinkedList.printList(head);
        PrintLinkedList.printList(deleteDuplicates(head));
    }
}
