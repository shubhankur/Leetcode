package Helper;

import Collection.ListNode;

import java.util.ArrayList;
import java.util.List;

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

    public static ListNode createListWithRandom(int[] arr, int[] random){
        List<ListNode> nodes =  new ArrayList<>();
        ListNode result = new ListNode(arr[0]);
        ListNode head = result;
        for (int i =1; i<arr.length;i++){
            nodes.add(result);
            result.next = new ListNode(arr[i]);
            result = result.next;
        }
        nodes.add(result);
        for(int i = 0;i<random.length;i++){
            if(random[i]!=-1){
                nodes.get(i).random = nodes.get(random[i]);
            }
        }
        return head;
    }
}
