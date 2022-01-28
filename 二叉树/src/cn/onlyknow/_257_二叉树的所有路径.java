package cn.onlyknow;

import java.util.ArrayList;
import java.util.List;

public class _257_二叉树的所有路径 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        if (root == null)
            return result;

        List<Integer> path = new ArrayList<>();
        traversal(root, path, result);
        return result;
    }

    private void traversal(TreeNode node, List<Integer> path, List<String> result) {
        path.add(node.val);

        if (node.left == null && node.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size() - 1; i++) {
                sb.append(path.get(i)).append("->");
            }
            sb.append(path.get(path.size() - 1));
            result.add(sb.toString());
            return;
        }

        if (node.left != null) {
            traversal(node.left, path, result);
            path.remove(path.size() - 1);
        }

        if (node.right != null) {
            traversal(node.right, path, result);
            path.remove(path.size() - 1);
        }
    }
}
