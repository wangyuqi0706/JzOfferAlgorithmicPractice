import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class JZ24 {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return res;
        Traversal(root, target);
        return res;
    }

    public void Traversal(TreeNode root, int target) {
        path.add(root.val);
        target -= root.val;
        //必须是叶结点
        if (target == 0 && root.left == null && root.right == null)
            res.add(new ArrayList<>(path));
        else if (target > 0) {
            if (root.left != null && root.left.val <= target)
                Traversal(root.left, target);
            if (root.right != null && root.right.val <= target)
                Traversal(root.right, target);
        }
        //回溯
        path.remove(path.size() - 1);
    }

    @Test
    public void test() {
        JZ4 solution = new JZ4();
        int[] pre = {1, 2, 9, 4, 5, 6, 7};
        int[] in = {9, 2, 4, 1, 6, 5, 7};
        var tree = solution.reConstructBinaryTree(pre, in);
        ArrayList<ArrayList<Integer>> res = FindPath(tree, 12);
        System.out.println(res);
    }
}
