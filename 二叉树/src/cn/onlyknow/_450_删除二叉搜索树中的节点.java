package cn.onlyknow;

public class _450_删除二叉搜索树中的节点 {
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root, key);
    }

    private TreeNode delete(TreeNode node, int key) {
        if (node == null)
            return null;

        if (key > node.val)
            node.right = delete(node.right, key);
        else if (key < node.val)
            node.left = delete(node.left, key);
        else {
            if (node.left == null)
                return node.right;
            if (node.right == null)
                return node.left;

            TreeNode temp = node.right;
            while (temp.left != null)
                temp = temp.left;
            node.val = temp.val;
            node.right = delete(node.right, node.val);
        }

        return node;
    }
}
