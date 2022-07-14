package LinkedList;

import Collection.ListNode;
import Helper.CreateLinkedList;
import Helper.PrintLinkedList;

public class PalindromeList {
    //Approach 1 :- recursive
    //     ListNode front;
//     public boolean isPalindrome(ListNode head) {
//         front = head;
//         return check(head);

    //     }
//     public boolean check(ListNode head){
//         if(head==null){
//             return true;
//         }
//         boolean result = check(head.next);
//         if(!result) return false;
//         if(front.val!=head.val) return false;
//         front = front.next;
//         return true;
//     }

    //Approach 2

    //Step 1 :- find the mid point
    //Step 2 :- reverse the second half
    //Step 3 :- run one by one in first half and the reverted secind half to check for Palindrome
    //Step 4 :- Reorganize the linked list by reverting back the second half;
    public static boolean isPalindrome(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = true;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid = slow;
        mid = reverse(mid);
        while(mid!=null){
            if(head.val!=mid.val) {
                flag = false;
                break;
            }
            mid = mid.next;
            head = head.next;
        }
        slow.next = reverse(mid);
        if(flag)
            return true;
        else return false;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static ListNode getReverse(ListNode head){
        if(head==null || head.next == null){
            return head;
        }
        ListNode p = getReverse(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        ListNode head = CreateLinkedList.createList(new int[]{1,2,2,2,1});
        PrintLinkedList.printList(head);
        //System.out.println(isPalindrome(head));
        reverse(head);
    }


}
