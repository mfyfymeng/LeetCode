package cn.onlyknow;

public class _700_二叉搜索树中的搜索 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val)
            return root;

        if (val > root.val)
            return searchBST(root.right, val);
        else
            return searchBST(root.left, val);
    }
}
