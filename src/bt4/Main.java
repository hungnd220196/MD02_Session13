package bt4;

import static bt4.PostOrderTraversalBST.postOrderTraversal;

public class Main {
    public static void main(String[] args) {
        // Xây dựng BST như hình minh hoạ
        TreeNode root = new TreeNode(27);
        root.left = new TreeNode(14);
        root.right = new TreeNode(35);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(19);
        root.right.left = new TreeNode(42);
        root.right.right = new TreeNode(31);

        // Duyệt và in ra các phần tử theo thứ tự post order
        System.out.println("Duyệt theo thứ tự post order:");
        postOrderTraversal(root);
    }
}
