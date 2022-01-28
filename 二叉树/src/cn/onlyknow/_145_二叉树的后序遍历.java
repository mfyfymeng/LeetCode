package cn.onlyknow;

import java.util.ArrayList;
import java.util.List;

public class _145_二叉树的后序遍历 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode node, ArrayList<Integer> arrayList) {
        if (node == null)
            return;

        postorder(node.left, arrayList);
        postorder(node.right, arrayList);
        arrayList.add(node.val);
    }
}
