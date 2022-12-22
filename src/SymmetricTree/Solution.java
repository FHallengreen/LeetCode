package SymmetricTree;

import BinaryTreeInorderTraversal.TreeNode;

public class Solution {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return checkIfSymmetric(root.left, root.right);

    }

    public boolean checkIfSymmetric(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        } else if (!checkIfSymmetric(left.left, right.right)) {
            return false;
        } else if (!checkIfSymmetric(left.right, right.left)) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {

    }
}

