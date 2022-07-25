package BinaryTree;

import Collection.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    //By Iteration
    public List<List<Integer>> levelOrderTraversal(TreeNode root){
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        q.add(root);
        while(!q.isEmpty()){
            output.add(new ArrayList<>());
            int size = q.size();
            for (int i = 0;i<size;i++){
                root = q.remove();
                output.get(level).add(root.val);
                if(root.left!=null){
                    q.add(root.left);
                }
                if(root.right!=null){
                    q.add(root.right);
                }
            }
            level++;
        }
        return output;
    }

    //By Recursion

    private List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> levelOrderTraversalRecur(TreeNode root){
        if (root==null) return output;
        helper(root,0);
        return output;
    }
    public void helper(TreeNode root, int level){
        if(level==output.size()) output.add(new ArrayList());
        output.get(level).add(root.val);
        if(root.left!=null){
            helper(root.left,level+1);
        }
        if(root.right!=null){
            helper(root.right,level+1);
        }
    }


}
