package BinaryTree;

import Collection.TreeNode;
import Helper.CreateBinaryTree;

import java.util.Arrays;

public class FlattenTree {
    public void flatten(TreeNode root) {
        if(root == null) return;
        solve(root,root.left);

    }
    public TreeNode solve(TreeNode root, TreeNode node){
        if(node == null) return root;
        TreeNode right = root.right;
        root.left = null;
        root.right = node;
        node = solve(node,node.left);
        node = solve(node,right);
        return node;
    }
}
class Solution2 {
    public static void main(String[] args) {
        FlattenTree flattenTree = new FlattenTree();
        TreeNode root = CreateBinaryTree.createBinaryTree(Arrays.asList(1,null,2,3));
        flattenTree.flatten(root);
        System.out.println(root);
    }
}
