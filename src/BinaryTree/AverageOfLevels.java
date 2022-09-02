package BinaryTree;

import Collection.TreeNode;
import Helper.CreateBinaryTree;
import Helper.PrintBinaryTree;

import java.util.*;

public class AverageOfLevels {
    public static List<Double> averageOfLevels(TreeNode root){
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(queue.size()>1){
            long sum = 0,count=0;
            while(queue.peek()!=null){
                TreeNode node = queue.remove();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
                sum+= node.val;
                count++;
            }
            queue.remove();
            queue.add(null);
            result.add(sum*1.0/count);
        }
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = CreateBinaryTree.createBinaryTree(Arrays.asList(2147483647,2147483647,2147483647));
        System.out.println(averageOfLevels(root));
    }
}
