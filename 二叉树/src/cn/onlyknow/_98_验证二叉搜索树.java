package cn.onlyknow;

import java.util.ArrayList;
import java.util.List;

public class _98_验证二叉搜索树 {
    List<Integer> value = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        value.clear();
        traversal(root);

        for (int i = 1; i < value.size(); i++) {
            if (value.get(i - 1) >= value.get(i))
                return false;
        }

        return true;
    }

    private void traversal(TreeNode node) {
        if (node == null)
            return;

        traversal(node.left);
        value.add(node.val);
        traversal(node.right);
    }
}
