import java.util.Arrays;

public class JZ4 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0)
            return null;
        //获取根节点
        int root = pre[0];
        TreeNode tree = new TreeNode(root);
        //在中序数组中找到根节点
        int rootIndexIn = indexOf(in, root);
        //分出左右子树的中序序列
        int[] inLeft = Arrays.copyOfRange(in, 0, rootIndexIn);
        int[] inRight;
        try {
            inRight = Arrays.copyOfRange(in, rootIndexIn + 1, in.length);
        } catch (IndexOutOfBoundsException e) {
            inRight = new int[]{};
        }
        //由中序序列得到前序序列
        int[] preLeft;
        if (inLeft.length > 0)
            preLeft = Arrays.copyOfRange(pre, 1, 1 + inLeft.length);
        else
            preLeft = new int[]{};

        int[] preRight;
        if (inRight.length > 0)
            preRight = Arrays.copyOfRange(pre, 1 + inLeft.length, pre.length);
        else
            preRight = new int[]{};
        //递归获得左右子树
        tree.left = reConstructBinaryTree(preLeft, inLeft);
        tree.right = reConstructBinaryTree(preRight, inRight);

        return tree;

    }

    int indexOf(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        JZ4 solution = new JZ4();
        int[] pre = {1, 2, 3, 4, 5, 6, 7};
        int[] in = {3, 2, 4, 1, 6, 5, 7};
        TreeNode result = solution.reConstructBinaryTree(pre, in);
        System.out.println(result);
    }
}
