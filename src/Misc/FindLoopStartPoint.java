package Misc;

import Collection.ListNode;

public class FindLoopStartPoint {
    public static ListNode detectCycle(ListNode head) {
        //  if(head==null) return null;
        // List<ListNode> list = new ArrayList<>();
        // while(head.next!=null){
        //     if(list.contains(head)) return head;
        //     list.add(head);
        //     head = head.next;
        // }
        // return null;
        ListNode pivot = getIntersectionPoint(head);
        if(pivot == null) return null;
        while(head!=pivot){
            head = head.next;
            pivot = pivot.next;
        }
        return pivot;

    }
    public static ListNode getIntersectionPoint(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast) return slow;
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        ListNode first = head;
        for (int i=6;i>0;i--) {
            ListNode temp = new ListNode(i);
            head.next = temp;
            head = temp;
        }
        head.next = first.next.next.next;
        System.out.println(detectCycle(first));
        System.out.println("hello");
    }
}
