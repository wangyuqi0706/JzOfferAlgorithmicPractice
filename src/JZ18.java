public class JZ18 {
    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        Mirror(root.right);
        Mirror(root.left);
    }
}
