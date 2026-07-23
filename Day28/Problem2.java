package Day28;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Problem2 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        if (val < root.val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right = insertIntoBST(root.right, val);

        return root;
    }

    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Problem2 obj = new Problem2();

        TreeNode root = null;
        root = obj.insertIntoBST(root, 4);
        root = obj.insertIntoBST(root, 2);
        root = obj.insertIntoBST(root, 7);
        root = obj.insertIntoBST(root, 1);
        root = obj.insertIntoBST(root, 3);

        inorder(root);
    }
}
