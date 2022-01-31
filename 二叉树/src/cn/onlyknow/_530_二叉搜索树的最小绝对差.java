package cn.onlyknow;

import java.util.ArrayList;
import java.util.List;

public class _530_二叉搜索树的最小绝对差 {
    List<Integer> value = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        value.clear();
        traversal(root);

        if (value.size() <= 1)
            return 0;

        int result = Integer.MAX_VALUE;
        for (int i = 1; i < value.size(); i++) {
            result = Math.min(result, value.get(i) - value.get(i - 1));
        }

        return result;
    }

    private void traversal(TreeNode node) {
        if (node == null)
            return;

        traversal(node.left);
        value.add(node.val);
        traversal(node.right);
    }
}
