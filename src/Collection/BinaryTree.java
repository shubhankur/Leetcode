package Collection;

public class BinaryTree {
    public ListNode createBinaryTree(ListNode root, int[] arr){
        ListNode head = root;
        for (int n:arr) {
            while (root!=null) {
                if (n >= root.val) {
                    root = root.right;
                } else {
                    root = root.left;
                }
            }
            root = new ListNode(n);
        }
        return head;
    }
}
