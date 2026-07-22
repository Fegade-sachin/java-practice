package arrays.array_program_practice;

class DLLNode {
    int data;
    DLLNode prev, next;
    DLLNode(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class DLLToBinaryTree {

    private int countNodes(DLLNode head) {
        int count = 0;
        DLLNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private TreeNode sortedListToBST(DLLNode[] headRef, int n) {
        if (n <= 0) return null;

        // Build left subtree
        TreeNode left = sortedListToBST(headRef, n / 2);

        // Current node becomes root
        TreeNode root = new TreeNode(headRef[0].data);
        root.left = left;

        // Move DLL head forward
        headRef[0] = headRef[0].next;

        // Build right subtree
        root.right = sortedListToBST(headRef, n - n / 2 - 1);

        return root;
    }

    public TreeNode convert(DLLNode head) {
        int n = countNodes(head);
        DLLNode[] headRef = new DLLNode[]{head};
        return sortedListToBST(headRef, n);
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        DLLNode head = new DLLNode(1);
        head.next = new DLLNode(2); head.next.prev = head;
        head.next.next = new DLLNode(3); head.next.next.prev = head.next;
        head.next.next.next = new DLLNode(4); head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new DLLNode(5); head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new DLLNode(6); head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new DLLNode(7); head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        DLLToBinaryTree tree = new DLLToBinaryTree();
        TreeNode treeNode = tree.convert(head);

        System.out.println("Inorder Traversal of constructed Binary Tree:");
        tree.inorder(treeNode);

        System.out.println("\nPreorder Traversal of constructed Binary Tree:");
        tree.preorder(treeNode);
    }
}
