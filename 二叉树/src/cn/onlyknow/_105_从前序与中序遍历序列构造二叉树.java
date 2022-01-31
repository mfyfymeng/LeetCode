package cn.onlyknow;

public class _105_从前序与中序遍历序列构造二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode build(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight) {
        if (preRight - preLeft < 1)
            return null;

        if (preRight - preLeft == 1)
            return new TreeNode(preorder[preLeft]);

        int rootVal = preorder[preLeft];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = 0;
        for (int i = inLeft; i < inRight; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        root.left = build(preorder, preLeft + 1, preLeft + 1 + (rootIndex - inLeft), inorder, inLeft, rootIndex);
        root.right = build(preorder, preLeft + 1 + (rootIndex - inLeft), preRight, inorder, rootIndex + 1, inRight);

        return root;
    }
}
