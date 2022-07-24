package BinaryTree;

import Collection.TreeNode;
import Helper.CreateBinaryTree;
import Helper.PrintBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    // By Recursion
    private static List<Integer> output = new ArrayList<>();
    public static List<Integer> preorderTraversal(TreeNode root){
        if(root == null) return null;
        output.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return output;
    }

    //By Iteration


    public static void main(String[] args) {
        int[] arr = new int[]{3,9,20,-1,-1,15,7,9,10};
        List<Integer> list = new ArrayList<>();
        for(int n : arr){
            if(n==-1) list.add(null);
            else list.add(n);
        }
        TreeNode node = CreateBinaryTree.createBinaryTree(list);
        PrintBinaryTree.printTree(node);
        preorderTraversal(node);
        for(int n : output){
            System.out.println(n + " ");
        }
    }
}
