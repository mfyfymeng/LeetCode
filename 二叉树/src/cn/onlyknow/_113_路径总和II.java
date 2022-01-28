package cn.onlyknow;

import java.util.ArrayList;
import java.util.List;

public class _113_路径总和II {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        List<Integer> path = new ArrayList<>();
        traversal(root, targetSum, path, result);
        return result;
    }

    private void traversal(TreeNode node, int targetSum, List<Integer> path, List<List<Integer>> result) {
        path.add(node.val);

        if (node.left == null && node.right == null) {
            if (node.val == targetSum) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        if (node.left != null) {
            traversal(node.left, targetSum - node.val, path, result);
            path.remove(path.size() - 1);
        }

        if (node.right != null) {
            traversal(node.right, targetSum - node.val, path, result);
            path.remove(path.size() - 1);
        }
    }
}
