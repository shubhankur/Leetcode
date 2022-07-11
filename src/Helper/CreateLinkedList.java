package Helper;

import Collection.ListNode;

public class CreateLinkedList {
    public static ListNode createList(int[] arr){
        ListNode result = new ListNode(arr[0]);
        ListNode head = result;
        for (int i =1; i<arr.length;i++){
            result.next = new ListNode(arr[i]);
            result = result.next;
        }
        return head;
    }
}
