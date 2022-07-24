package Helper;

import Collection.TreeNode;

import java.util.*;

public class CreateBinaryTree {
    public static TreeNode createBinaryTree(List<Integer> nodes){
        if(nodes.isEmpty()) return null;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode head = new TreeNode(nodes.get(0));
        TreeNode copy = head;
        q.add(head);
        for(int i = 1;i< nodes.size()-1;i+=2) {
                head = q.remove();
                if(nodes.get(i)!=null) {
                    head.left = new TreeNode(nodes.get(i));
                    q.add(head.left);
                }
                if(nodes.get(i+1)!=null) {
                    head.right = new TreeNode(nodes.get(i + 1));
                    q.add(head.right);
                }
            }
        return copy;
    }
}
