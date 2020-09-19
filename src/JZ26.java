import java.util.ArrayList;

public class JZ26 {
    private TreeNode last = null;
    private ArrayList<TreeNode> treeNodes = new ArrayList<>();

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        inOrderTraverse(pRootOfTree);
        for (int i = 0; i < treeNodes.size(); i++) {
            if (i + 1 < treeNodes.size())
                treeNodes.get(i).right = treeNodes.get(i + 1);
            if (i - 1 >= 0)
                treeNodes.get(i).left = treeNodes.get(i - 1);
        }

        return treeNodes.get(0);

    }

    private void inOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraverse(root.left);
        treeNodes.add(root);
        inOrderTraverse(root.right);

    }


}
