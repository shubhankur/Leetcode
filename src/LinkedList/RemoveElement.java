package LinkedList;

import Collection.ListNode;
import Helper.CreateLinkedList;
import Helper.PrintLinkedList;

public class RemoveElement {
    public static ListNode removeElements(ListNode head, int val) {
        // ListNode copy = head;
        // while(copy!=null && copy.val==val){
        //     head=head.next;
        //     copy = copy.next;
        // }
        // if(copy == null) return null;
        // while(copy!=null && copy.next!=null){
        //     if(copy.next.val == val){
        //         copy.next = copy.next.next;
        //     }
        //     else copy = copy.next;
        // }
        // return head;

        if(head == null || head.next==null){
            PrintLinkedList.printList(head);
            System.out.println();
            return head;
        }
        if (head.next.val == val){
            head.next = removeElements(head.next.next,val);
        }
        else{
            head.next = removeElements(head.next,val);
        }
        PrintLinkedList.printList(head);
        System.out.println();
        return head;
    }

    public static void main(String[] args) {
        ListNode head = CreateLinkedList.createList(new int[]{1,2,6,4,7,6,8});
        PrintLinkedList.printList(head);
        head = removeElements(head,6);
        PrintLinkedList.printList(head);
    }
}