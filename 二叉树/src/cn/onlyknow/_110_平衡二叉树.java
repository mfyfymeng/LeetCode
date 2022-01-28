package cn.onlyknow;

public class _110_平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        return getDepth(root) == -1 ? false : true;
    }

    private int getDepth(TreeNode node) {
        if (node == null)
            return 0;

        int leftDepth = getDepth(node.left);
        if (leftDepth == -1)
            return -1;

        int rightDepth = getDepth(node.right);
        if (rightDepth == -1)
            return -1;

        int abs = Math.abs(leftDepth - rightDepth);
        return abs > 1 ? -1 : Math.max(leftDepth, rightDepth) + 1;
    }
}
