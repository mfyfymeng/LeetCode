package cn.onlyknow;

import java.util.ArrayList;
import java.util.List;

public class _501_二叉搜索树中的众数 {
    List<Integer> result = new ArrayList<>();
    int count;
    int max;
    TreeNode pre;

    public int[] findMode(TreeNode root) {
        result.clear();
        count = 0;
        max = 0;
        pre = null;

        traversal(root);

        int[] res = new int[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }

        return res;
    }

    private void traversal(TreeNode node) {
        if (node == null)
            return;

        traversal(node.left);

        int value = node.val;
        if (pre == null || value != pre.val)
            count = 1;
        else
            count++;

        if (count > max) {
            result.clear();
            result.add(node.val);
            max = count;
        }
        else if (count == max) {
            result.add(node.val);
        }

        pre = node;
        traversal(node.right);
    }
}
