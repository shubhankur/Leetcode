package LinkedList;

import Collection.ListNode;
import Helper.CreateLinkedList;
import Helper.PrintLinkedList;

public class ReorderList {
    public static void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        mid = reverseList(mid);
        while(mid!=null){
            if(head.next == mid) {
                head = head.next;
                mid = mid.next;
                continue;
            }
            ListNode nextNode = head.next;
            ListNode nextMid  = mid.next;
            head.next = mid;
            mid.next = nextNode;
            mid = nextMid;
            head = nextNode;
        }
    }
    public static ListNode reverseList(ListNode head){
        ListNode node = null;
        while(head!=null){
            ListNode nextNode = head.next;
            head.next = node;
            node = head;
            head = nextNode;
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode head = CreateLinkedList.createList(new int[]{1,2,3,4,5});
        PrintLinkedList.printList(head);
        reorderList(head);
        PrintLinkedList.printList(head);
    }
}
