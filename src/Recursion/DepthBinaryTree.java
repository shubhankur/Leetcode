package Recursion;

import Collection.BinaryTree;
import Collection.ListNode;
import Helper.PrintBinaryTree;


public class DepthBinaryTree {
    static int depth=0;
    public static int maxDepth(ListNode root) {
        calculateDepth(root);
        return 0;
    }

    public static int calculateDepth(ListNode root){
        int leftDepth=0;
        int rightDepth=0;
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left!=null){
            leftDepth = calculateDepth(root.left);
        }
        if (root.right!=null){
            rightDepth = calculateDepth(root.right);
        }
        return leftDepth>rightDepth?leftDepth:rightDepth;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        ListNode top = head;
//        for(int i=2;i<9;i++){
//            ListNode leftNode = new ListNode(i);
//            ListNode rightNode = new ListNode(++i);
//            head.left = leftNode;
//            head.right = rightNode;
//            head = head.left;
//        }
        int[] arr = new int[]{5,1,9,3,0,2,4,8};
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree(head,arr);
        PrintBinaryTree.print2D(head);
        //int result = maxDepth(top);
        //System.out.println(result);
    }
}
