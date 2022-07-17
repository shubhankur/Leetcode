package Helper;

import Collection.ListNode;

public class PrintLinkedList {
    public static void printList(ListNode result) {
        while (result != null) {
            System.out.print(result.val + "-->");
            result = result.next;
        }
        System.out.println("null");
    }

    public static void printListWithRandom(ListNode result) {
        while (result != null) {
            if (result.random != null)
                System.out.print(result.val  +"["+ result + "] (" + result.random.val + "["+ result.random+ "])  -->");
            else
                System.out.print(result.val +"["+ result + "] (" + null + ")  -->");
            result = result.next;
        }
        System.out.println("null");
    }
}
