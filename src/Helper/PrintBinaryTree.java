package Helper;

import Collection.ListNode;

public class PrintBinaryTree {
    static final int COUNT = 10;
    static void print2DUtil(ListNode root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.val + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    // Wrapper over print2DUtil()
    public static void print2D(ListNode root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
}
