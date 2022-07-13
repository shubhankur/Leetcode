package LinkedList;

import Collection.ListNode;

public class IntersectingNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // List<ListNode> nodes = new ArrayList<>();
        // while(headA!=null){
        //     nodes.add(headA);
        //     headA = headA.next;
        // }
        // while(headB!=null){
        //     if(nodes.contains(headB)) return headB;
        //     headB = headB.next;
        // }
        // return null;



        // int la = 0,lb = 0;
        // ListNode copyA = headA;
        // ListNode copyB = headB;
        // while(headA!=null || headB!=null){
        //     if(headA!=null) {
        //         la++;
        //         headA=headA.next;
        //     }
        //     if(headB!=null) {
        //         lb++;
        //         headB = headB.next;
        //     }
        // }
        // if(la>lb){
        //     for(int i =0;i<la-lb;i++){
        //         copyA=copyA.next;
        //     }
        // }
        // else{
        //     for(int i =0;i<lb-la;i++){
        //         copyB=copyB.next;
        //     }
        // }
        // while(copyA!=null && copyB!=null){
        //     if(copyA==copyB) return copyA;
        //     copyA=copyA.next;
        //     copyB = copyB.next;
        // }
        // return null;


        //This one is modification of the above one
        //Both will complete the iteration once and then the shorter one will start from the head of the longer one and by the time the longer one completes the iteration and go to the head of the shorter one, the previous pointer will travel the difference already.and so both pointer will be at the same distance from the common node and then we can move both of them one step till they meet.
        ListNode pa = headA, pb = headB;
        while(pa!=pb){
            if(pa==null){
                pa = headB;
            }
            else pa = pa.next;
            if(pb==null){
                pb=headA;
            }
            else pb = pb.next;
        }
        return pa;
    }
}