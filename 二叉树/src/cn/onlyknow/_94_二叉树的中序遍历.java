package cn.onlyknow;

import java.util.ArrayList;
import java.util.List;

public class _94_二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, ArrayList<Integer> arrayList) {
        if (node == null)
            return;

        inorder(node.left, arrayList);
        arrayList.add(node.val);
        inorder(node.right, arrayList);
    }
}
