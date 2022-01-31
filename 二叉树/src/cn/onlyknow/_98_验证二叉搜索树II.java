package cn.onlyknow;

public class _98_验证二叉搜索树II {
    TreeNode pre;

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        boolean left = isValidBST(root.left);
        if (!left)
            return false;

        if (pre != null && root.val <= pre.val)
            return false;

        pre = root;

        boolean right = isValidBST(root.right);
        if (!right)
            return false;

        return true;
    }
}
