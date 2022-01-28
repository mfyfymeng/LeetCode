package cn.onlyknow;

import java.util.ArrayList;
import java.util.List;

public class _144_二叉树的前序遍历 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, ArrayList<Integer> arrayList) {
        if (node == null)
            return;

        arrayList.add(node.val);
        preorder(node.left, arrayList);
        preorder(node.right, arrayList);
    }
}
