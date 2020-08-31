public class JZ17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        //相当于前序遍历root1的每个结点
        if (root1 == null || root2 == null)
            return false;
        //利用逻辑表达式的中断性，只要前面的为真，后面就不必运行
        return judge(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    private boolean judge(TreeNode root1, TreeNode root2) {
        //若root2先到尽头，说明root2规模更小
        if (root2 == null) return true;
        //反之，说明root2规模更大，不可能是root1的子树
        if (root1 == null) return false;
        /*
         * 若同时满足：
         * 1.根结点值相等
         * 2.左子树与左子树满足子结构
         * 3.右子树与右子树满足子结构
         * 那么返回真
         */
        return root1.val == root2.val && judge(root1.right, root2.right) && judge(root1.left, root2.left);
    }

    public static void main(String[] args) {

    }
}
