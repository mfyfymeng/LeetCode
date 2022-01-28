package cn.onlyknow;

import java.util.List;

public class _559_N叉树的最大深度 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public int maxDepth(Node root) {
        if (root == null)
            return 0;

        int depth = 0;
        if (root.children != null) {
            for (Node node : root.children) {
                depth = Math.max(depth, maxDepth(node));
            }
        }

        return depth + 1;
    }
}
