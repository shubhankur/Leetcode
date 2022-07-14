package LinkedList;

import Collection.ListNode;
import Collection.ListNode2;
public class FlattenMultiLevelLinkedList {
//    public static ListNode2 flatten(ListNode2 head) {
//        ListNode2 copy = head;
//        process(head);
//        return copy;
//    }
//    public static ListNode2 process(ListNode2 head){
//        if(head==null||head.next==null) return head;
//        ListNode2 p = process(head.next);
//        if(head.child==null) return p;
//        else{
//            ListNode2 next = head.next;
//            ListNode2 child = head.child;
//            child.prev = head;
//            head.next = child;
//            head.child = null;
//            ListNode2 p2 = process(child);//4
//            p2.next = next;
//            next.prev = p2;
//            return next;
//        }
//    }

    public static ListNode2 flatten(ListNode2 head){
        ListNode2 copy = head;
        while(copy!=null){
            if(copy.child!=null){
                ListNode2 child = copy.child;
                ListNode2 next = copy.next;
                ListNode2 node = processChildNode(child);//last node in the child branch
                copy.next = child;
                child.prev = copy;
                node.next = next;
                next.prev = node;
                copy.child = null;
                copy = node;
            }
            else {
                copy = copy.next;
            }
        }
        return head;
    }

    public static ListNode2 processChildNode(ListNode2 child){
        while (child.next!=null){
            if(child.child!=null){
                flatten(child);
            }
            child = child.next;
        }
        return child;
    }

    public static void main(String[] args) {
        ListNode2 head = new ListNode2(1);
        ListNode2 node2 = new ListNode2(2);
        head.next = node2;
        node2.prev = head;
        ListNode2 node3 = new ListNode2(3);
        node2.next = node3;
        node3.prev = node2;
        ListNode2 node4 = new ListNode2(4);
        node3.child = node4;
        ListNode2 node5 = new ListNode2(5);
        node4.next = node5;
        node5.prev = node4;
        ListNode2 node6 = new ListNode2(6);
        node5.child = node6;
        ListNode2 node9 = new ListNode2(9);
        node6.next = node9;
        ListNode2 node7 = new ListNode2(7);
        node5.next = node7;
        node7.prev = node5;
        ListNode2 node8 = new ListNode2(8);
        node3.next = node8;
        node8.prev = node3;
        head = flatten(head);
        System.out.println(head);

    }
}
