package BinaryTree;

import Collection.TreeNode;
import Helper.CreateBinaryTree;
import Helper.PrintBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
    // By Recursion
    private static List<Integer> output = new ArrayList<>();
    public static List<Integer> preorderTraversal(TreeNode root){
        if(root == null) return output;
        output.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return output;
    }

    //By Iteration
    public static List<Integer> preorderTraversalRecur(TreeNode root){
        List<Integer> output = new ArrayList<>();
        if(root == null) return output;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            root = stack.pop();
            output.add(root.val);
            if(root.right!=null){
                stack.push(root.right);
            }
            if(root.left!=null){
                stack.push(root.left);
            }
        }
        return output;
    }

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
