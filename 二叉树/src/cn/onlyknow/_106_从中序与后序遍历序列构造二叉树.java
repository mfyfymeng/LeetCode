package cn.onlyknow;

public class _106_从中序与后序遍历序列构造二叉树 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    private TreeNode build(int[] inorder, int inLeft, int inRight,
                           int[] postorder, int postLeft, int postRight) {

        if (inRight - inLeft < 1)
            return null;

        if (inRight - inLeft == 1)
            return new TreeNode(inorder[inLeft]);

        int rootVal = postorder[postRight - 1];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = 0;
        for (int i = inLeft; i < inRight; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        root.left = build(inorder, inLeft, rootIndex, postorder, postLeft, postLeft + (rootIndex - inLeft));
        root.right = build(inorder, rootIndex + 1, inRight, postorder, postLeft + (rootIndex - inLeft), postRight - 1);

        return root;
    }
}
