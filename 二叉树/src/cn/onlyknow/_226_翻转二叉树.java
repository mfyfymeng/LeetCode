package cn.onlyknow;

import java.util.LinkedList;
import java.util.Queue;

public class _226_翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        invertTree(root.left);
        invertTree(root.right);
        swap(root);

        return root;
    }

    private void swap(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
