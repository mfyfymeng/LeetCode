package cn.onlyknow;

public class _235_二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return traversal(root, p, q);
    }

    private TreeNode traversal(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null)
            return null;

        if (node.val > p.val && node.val > q.val) {
            TreeNode left = traversal(node.left, p, q);
            if (left != null)
                return left;
        }

        if (node.val < p.val && node.val < q.val) {
            TreeNode right = traversal(node.right, p, q);
            if (right != null)
                return right;
        }

        return node;
    }
}
