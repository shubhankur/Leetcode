package Recursion;

import Collection.ListNode;
import Helper.PrintBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinarySearchTree {
    public static ListNode findNode(ListNode top,int val){
        return null;
    }

    public static void main(String args[]) {
        Random random = new Random();
        ListNode head = new ListNode(random.nextInt(100));
        ListNode top = head;
        for(int i=2;i<12;i++){
            ListNode leftNode = new ListNode(i);
            ListNode rightNode = new ListNode(++i);
            head.left = leftNode;
            head.right = rightNode;
            head = head.left;
        }

        ListNode result = findNode(top,6);
        PrintBinaryTree.print2D(top);
        System.out.println(result);
        List list = new ArrayList();
    }
}
