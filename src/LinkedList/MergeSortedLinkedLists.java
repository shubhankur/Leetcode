package LinkedList;

import Collection.ListNode;
import Helper.PrintLinkedList;

public class MergeSortedLinkedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val<= list2.val){
            result = new ListNode(list1.val);
            list1 = list1.next;
        }
        else{
            result = new ListNode(list2.val);
            list2= list2.next;
        }
        ListNode head = result;
        while(list1!=null || list2!=null){
            if(list1 == null){
                while(list2 != null){
                    ListNode newNode = new ListNode(list2.val);
                    result.next = newNode;
                    list2 = list2.next;
                    result = result.next;
                }
                break;
            }
            if(list2 == null){
                while(list1 != null){
                    ListNode newNode = new ListNode(list1.val);
                    result.next = newNode;
                    list1 = list1.next;
                    result = result.next;
                }
                break;
            }
            ListNode newNode;
            if(list1.val<=list2.val){
                newNode = new ListNode(list1.val);
                list1 = list1.next;
            }
            else{
                newNode = new ListNode(list2.val);
                list2 = list2.next;
            }
            result.next  = newNode;
            result = result.next;
        }
        return head;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode result = head;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                result.next = list1;
                list1 = list1.next;
            }
            else{
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        result.next = list1 == null?list2:list1;
        return head.next;
    }

    public static ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        if (l1 == null) {
            PrintLinkedList.printList(l2);
            System.out.println();
            return l2;
        }
        else if (l2 == null) {
            PrintLinkedList.printList(l1);
            System.out.println();
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists3(l1.next, l2);
            PrintLinkedList.printList(l1);
            System.out.println();
            return l1;
        }
        else {
            l2.next = mergeTwoLists3(l1, l2.next);
            PrintLinkedList.printList(l2);
            System.out.println();
            return l2;
        }

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode first = head;
        for (int i=4;i<10;i+=2) {
            ListNode temp = new ListNode(i);
            head.next = temp;
            head = temp;
        }
        ListNode head2 = new ListNode(1);
        ListNode second = head2;
        for (int i=2;i<6;i++) {
            ListNode temp = new ListNode(i);
            head2.next = temp;
            head2 = temp;
        }
        ListNode result = mergeTwoLists3(first,second);
        PrintLinkedList.printList(result);
    }
}
