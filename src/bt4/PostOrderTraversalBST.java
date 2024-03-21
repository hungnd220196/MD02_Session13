package bt4;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int value) {
        val = value;
        left = right = null;
    }
}

public class PostOrderTraversalBST {
    // Duyệt theo thứ tự post order trong BST
    public static void postOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        // Bước 1: Duyệt các cây con bên trái một cách đệ quy
        postOrderTraversal(root.left);

        // Bước 2: Duyệt các cây con bên phải một cách đệ quy
        postOrderTraversal(root.right);

        // Bước 3: Truy cập nút gốc
        System.out.print(root.val + " ");
    }

}
