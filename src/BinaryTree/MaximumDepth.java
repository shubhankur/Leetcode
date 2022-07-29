package BinaryTree;

import Collection.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepth {
    //By Iteration
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        int length = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i<size;i++){
                root = q.remove();
                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
            }
            length++;
        }
        return length;
    }

    //By recursion
    //Method 1
    //bottom up approach
    public int maxDepthRecur(TreeNode root){
        if(root==null) return 0;
        int leftDepth = maxDepthRecur(root.left);
        int rightDepth = maxDepthRecur(root.right);
        return 1 + Math.max(leftDepth,rightDepth);
    }
    //Method 2
    //top-down approach
    private int max = 0;
    public int maxDepthRecur2(TreeNode root, int depth){
        if(root==null) return depth;
        if(root.left==null && root.right==null){
            max = depth>max?depth:max;
        }
        maxDepthRecur2(root.left,depth+1);
        maxDepthRecur2(root.right,depth+1);
        return max;
    }
}
