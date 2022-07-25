package BinaryTree;

import Collection.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
    //By Recursion
    private List<Integer> output = new ArrayList<>();
    public List<Integer> postOrderTraversalRecur(TreeNode root){
        if(root == null) return output;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        output.add(root.val);
        return output;
    }

    //By Iteration
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if (root == null) return output;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.peek();
            if (root.right == null) {
                root = stack.pop();
                output.add(root.val);
            }
            TreeNode temp = root;
            root = root.right;
            temp.right = null;
        }
        return output;
    }
}
