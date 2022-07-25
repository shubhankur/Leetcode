package BinaryTree;

import Collection.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    //By Recursion
    private List<Integer> output = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return output;
        }
        inorderTraversal(root.left);
        output.add(root.val);
        inorderTraversal(root.right);
        return output;
    }

    //By Iteration
    public List<Integer> inorderTraversalIter(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if(root==null) return output;
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            output.add(root.val);
            root = root.right;
        }
        return output;
    }
}