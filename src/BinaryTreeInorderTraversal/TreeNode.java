package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {

    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list;
    }

    public static void inorder(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

    }
}