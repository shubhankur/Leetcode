package Helper;

import Collection.ListNode;

public class PrintLinkedList  {
    public static void printList(ListNode result){
        while (result!=null){
            System.out.print(result.val + "-->");
            result = result.next;
        }
        System.out.println("null");
    }
}
