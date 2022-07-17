package LinkedList;

import Collection.ListNode;
import Helper.CreateLinkedList;
import Helper.PrintLinkedList;

public class RotateRight {
    //    public static ListNode rotateRight(ListNode head, int k) {
//        //One pass algorithm using two pointers
//        if(head.next==null) return head;
//        ListNode first = head;
//        ListNode second = head;
//        for(int i = 0;i<=k;i++){
//            second =second.next;
//        }
//        while(second!=null){
//            second=second.next;
//            first=first.next;
//        }
//        ListNode result = reverseList(first.next);
//        first.next.next = head;
//        first.next = null;
//        return result;
//    }
    public static ListNode rotateRight(ListNode head, int k) {
        //One pass algorithm using two pointers
        ListNode original = head;
        ListNode first = head;
        int l = 0;
        while(head!=null && head.next!=null){
            head = head.next;
            l++;
        }
        l+=1;
        ListNode lastNode = head;
        int end;
        if(k>l) end = l-(k%l);
        else end = l-k;
        for(int i =0;i<end-1;i++){
            first = first.next;
        }
        ListNode node = first;
        ListNode result = node.next;
        node.next = null;
        lastNode.next = original;
        return result;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode node = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = node;
            node = head;
            head = nextNode;
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode head = CreateLinkedList.createList(new int[]{1,2});
        PrintLinkedList.printList(head);
        ListNode result = rotateRight(head, 0);
        PrintLinkedList.printList(result);
    }
}
