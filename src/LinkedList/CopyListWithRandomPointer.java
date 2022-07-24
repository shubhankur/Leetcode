package LinkedList;

import Collection.ListNode;
import Collection.TreeNode;
import Helper.CreateLinkedList;
import Helper.PrintLinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CopyListWithRandomPointer {

    //Approach 1 :- putting visited nodes together in a hash map
//    static Map<ListNode,ListNode> listNodes = new HashMap<>();
//    public static ListNode copyRandomList(ListNode head) {
//        if(head==null) return null;
//        ListNode p = copyRandomList(head.next);
//        ListNode ListNode;
//        if(listNodes.containsKey(head)){
//            ListNode = listNodes.get(head);
//        }
//        else{
//            ListNode = new ListNode(head.val);
//        }
//        listNodes.put(head,ListNode);
//        ListNode.next = p;
//        if(head.random!=null){
//            ListNode randomListNode1 = head.random;
//            ListNode randomListNode2;
//            if(listNodes.containsKey(randomListNode1)){
//                randomListNode2 = listNodes.get(randomListNode1);
//            }
//            else if(listNodes.containsKey(randomListNode1)){
//                randomListNode2= listNodes.get(randomListNode1);
//            }
//            else{
//                randomListNode2 = new ListNode(randomListNode1.val);
//            }
//            ListNode.random = randomListNode2;
//            listNodes.put(randomListNode1,randomListNode2);
//        }
//        return ListNode;
//    }

    //Approach 2:-
    //Weave the list together and then unweave it back;
    public static ListNode copyRandomList(ListNode head) {
        ListNode original = head;
        while (original != null) {
            ListNode copy = new ListNode(original.val);
            ListNode nextOriginal = original.next;
            original.next = copy;
            copy.next = nextOriginal;
            original = nextOriginal;
        }
        original = head;
        while (original != null) {
            original.next.random = (original.random)!=null?original.random.next:null;
            original = original.next.next;
        }
        //Unweaving
        original = head;
        ListNode copy = head.next;
        ListNode result = copy;
        while (original!=null && original.next!=null && original.next.next!=null){
            original.next = original.next.next;
            copy.next = (original.next!=null)?original.next.next:null;
            original = original.next;
            copy = copy.next;
        }
        return result;
    }


    public static void main(String[] args) {
        ListNode head = CreateLinkedList.createListWithRandom(new int[]{7, 13, 11, 10, 1}, new int[]{-1, 0, 4, 2, 0});
        PrintLinkedList.printList(head);
        head = copyRandomList(head);
        PrintLinkedList.printList(head);
    }
}
