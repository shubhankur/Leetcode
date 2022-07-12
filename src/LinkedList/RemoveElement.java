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
        if(head == null) return null;
//        else if(head.next == null) {
//            if(head.val!=val)
//                return head;
//            else return null;
//        }
        head.next = removeElements(head.next,val);
        if(head.val==val) return head.next;
        return head;

    }

    public static void main(String[] args) {
        ListNode head = CreateLinkedList.createList(new int[]{1,2,6,3,4,5,6});
        PrintLinkedList.printList(head);
        head = removeElements(head,6);
        PrintLinkedList.printList(head);
    }
}