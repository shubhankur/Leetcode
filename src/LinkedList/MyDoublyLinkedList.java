package LinkedList;

import Collection.ListNode;
import Collection.ListNode2;

class MyDoublyLinkedList {

    private ListNode2 head;

    public MyDoublyLinkedList() {

    }

    public int get(int index) {
        ListNode2 copy = head;
        for(int i =0;i<index;i++){
            copy = copy.next;
        }
        if(copy==null) return -1;
        return copy.val;
    }

    public void addAtHead(int val) {
        ListNode2 node = new ListNode2(val);
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addAtTail(int val) {
        ListNode2 node = new ListNode2(val);
        if(head == null){
            head = node;
            return;
        }
        ListNode2 copy = head;
        while(copy.next!=null){
            copy = copy.next;
        }
        copy.next = node;
        node.prev = copy;
    }

    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }
        ListNode2 node = new ListNode2(val);
        ListNode2 copy = head;
        for(int i = 0;i<index;i++){
            copy = copy.next;
        }
        ListNode2 next = copy.next;
        copy.next = node;
        node.prev = copy;
        node.next = next;
        next.prev = node;
    }

    public void deleteAtIndex(int index) {
        if(index==0){
            head = head.next;
            return;
        }
        ListNode2 copy = head;
        for(int i = 0;i<index;i++){
            copy = copy.next;
        }
        ListNode2 next = copy.next;
        if(next == null) return;
        copy.next = next.next;
        next.next.prev = copy;
    }
}

class Solution2 {
    public static void main(String[] args) {
        MyDoublyLinkedList obj = new MyDoublyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        int param_1 = obj.get(1);
        obj.deleteAtIndex(1);
        obj.get(1);
        obj.get(3);
        obj.deleteAtIndex(3);
        obj.deleteAtIndex(0);
        obj.get(0);
        obj.deleteAtIndex(0);
        obj.get(0);
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */