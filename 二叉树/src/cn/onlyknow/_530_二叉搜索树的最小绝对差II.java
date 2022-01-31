package cn.onlyknow;

public class _530_二叉搜索树的最小绝对差II {
    TreeNode pre;
    int result = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        traversal(root);
        return result;
    }

    private void traversal(TreeNode node) {
        if (node == null)
            return;

        traversal(node.left);

        if (pre != null) {
            result = Math.min(result, node.val - pre.val);
        }
        pre = node;

        traversal(node.right);
    }
}
