package LinkedList;

import Collection.ListNode;

class MyLinkedList {

    private ListNode head;
    public MyLinkedList() {

    }

    public int get(int index) {
        int c=0;
        ListNode node = head;
        while(node!=null && c<index){
            node = node.next;
            c++;
        }
        if(node == null) return -1;
        else return node.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    public void addAtTail(int val) {
        if(head == null){
            head = new ListNode(val);
            return;
        }
        ListNode node = head;
        while(node.next!=null){
            node = node.next;
        }
        node.next = new ListNode(val);
    }

    public void addAtIndex(int index, int val) {
        if(index == 0) {
            ListNode node = new ListNode(val);
            node.next = head;
            head = node;
            return;
        }
        ListNode node = head;
        for(int i =0;i<index-1;i++){
            if(node==null) return;
            node = node.next;
        }
        ListNode nextNode = node.next;  //null
        node.next = new ListNode(val);
        node.next.next = nextNode;
    }

    public void deleteAtIndex(int index) {
        if(index == 0){
            head = head.next;
            return;
        }
        ListNode node = head;
        for(int i =0;i<index-1;i++){
            if(node == null) return;
            node = node.next;
        }
        if(node.next != null)
            node.next = node.next.next;
    }
}

class Solution{
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1,2);
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