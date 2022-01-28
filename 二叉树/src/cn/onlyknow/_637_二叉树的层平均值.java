package cn.onlyknow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _637_二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if (root == null)
            return result;

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }

            list.add(level);
        }

        int size = list.size();
        for (int i = 0; i < size; i++) {
            List<Integer> temp = list.get(i);
            double average = 0.0;
            double sum = 0;
            int len = temp.size();
            for (int j = 0; j < len; j++) {
                sum += temp.get(j);
            }
            average = sum / len;
            result.add(average);
        }

        return result;
    }
}
