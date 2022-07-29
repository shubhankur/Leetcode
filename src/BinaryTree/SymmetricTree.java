package BinaryTree;

import Collection.TreeNode;
import Helper.CreateBinaryTree;

import java.util.*;

public class SymmetricTree {
    //By Iteration
    public boolean isSymmetric(TreeNode root) {
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        Queue<TreeNode> qLeft = new LinkedList<>();
        Queue<TreeNode> qRight = new LinkedList<>();
        if (leftNode != null) qLeft.add(leftNode);
        if (rightNode != null) qRight.add(rightNode);
        boolean flag = true;
        while (flag) {
            if (qLeft.size() != qRight.size()) return false;
            int size = qLeft.size();
            List<Integer> leftList = new ArrayList<>();
            List<Integer> rightList = new ArrayList<>();
            flag = false;
            for (int i = 0; i < size; i++) {
                leftNode = qLeft.remove();
                rightNode = qRight.remove();
                if(leftNode!=null) {
                    flag=true;
                    leftList.add(leftNode.val);
                    qLeft.add(leftNode.left);
                    qLeft.add(leftNode.right);
                }
                else{
                    leftList.add(null);
                }
                if(rightNode!=null) {
                    flag = true;
                    rightList.add(rightNode.val);
                    qRight.add(rightNode.left);
                    qRight.add(rightNode.right);
                }
                else {
                    rightList.add(null);
                }
            }
            if (!checkPalindrome(leftList, rightList)) return false;
        }
        if (qLeft.size() != qRight.size()) return false;
        return true;
    }

    public boolean checkPalindrome(List<Integer> listA, List<Integer> listB) {
        List<Integer> list = new ArrayList<>(listA);
        list.addAll(listB);
        for (int i = 0; i < list.size() / 2; i++) {
            if (!Objects.equals(list.get(i),list.get(list.size() - 1 - i))) return false;
        }
        return true;
    }

    //By Recursion

    public boolean isSymmetricR(TreeNode root){

        return true;
    }

}

class Solution {
    public static void main(String[] args) {
        SymmetricTree symmetricTree = new SymmetricTree();
        TreeNode root = CreateBinaryTree.createBinaryTree(Arrays.asList(1,2,2,null,3,null,3));
        System.out.println(symmetricTree.isSymmetric(root));
    }
}
