package cn.onlyknow;

public class _701_二叉搜索树中的插入操作II {
    TreeNode pre;

    public TreeNode insertIntoBST(TreeNode root, int val) {
        pre = new TreeNode(-1);

        if (root == null)
            root = new TreeNode(val);

        traversal(root, val);
        return root;
    }

    private void traversal(TreeNode node, int val) {
        if (node == null) {
            TreeNode newNode = new TreeNode(val);

            if (val > pre.val)
                pre.right = newNode;
            else
                pre.left = newNode;

            return;
        }

        pre = node;
        if (val > node.val)
            traversal(node.right, val);
        if (val < node.val)
            traversal(node.left, val);

        return;
    }
}
