package Helper;

import Collection.TreeNode;

import java.util.*;

public class PrintBinaryTree {
    public static List<List<Integer>> level(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root == null) return output;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        boolean flag = true;
        while (!q.isEmpty() && flag) {
            output.add(new ArrayList<>());
            int size = q.size();
            flag = false;
            for (int i = 0; i < size; i++) {
                root = q.remove();
                if (root != null) {
                    output.get(level).add(root.val);
                    if(root.left!=null) {
                        q.add(root.left);
                        flag=true;
                    }
                    else q.add(null);
                    if(root.right!=null) {
                        q.add(root.right);
                        flag = true;
                    }
                    else q.add(null);
                } else {
                    output.get(level).add(null);
                    q.add(null);
                    q.add(null);
                }
            }
            level++;
        }
        return output;
    }

    public static void printTree(TreeNode root) {
        List<List<Integer>> output = level(root);
        int space1 = output.size(), space2 = output.size();
        for (int i = 0; i < output.size(); i++) {
            for (int j = 0; j < space1; j++) {
                System.out.print("      ");
            }
            List list = output.get(i);
            for (int k = 0; k < list.size(); k++) {
                System.out.print(list.get(k));
                for(int l = 0;l < space2+2;l++){
                    System.out.print("      ");
                }
            }
            System.out.println();
            space1 = space1/2;
            space2 = space2/2;
        }
    }
}
