package cn.onlyknow;

public class _701_二叉搜索树中的插入操作 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            TreeNode node = new TreeNode(val);
            return node;
        }

        if (val > root.val)
            root.right = insertIntoBST(root.right, val);
        if (val < root.val)
            root.left = insertIntoBST(root.left, val);

        return root;
    }
}
