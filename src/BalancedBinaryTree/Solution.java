package BalancedBinaryTree;

import BinaryTreeInorderTraversal.TreeNode;

public class Solution {

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }
        int res = 0;
        int countLeft = maxDepth(root.left);
        int countRight = maxDepth(root.right);
        if (countLeft > countRight) {
            res = countLeft - countRight;
        } else if (countRight > countLeft) {
            res = countRight - countLeft;
        }
        if (res > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int countLeft = maxDepth(root.left);
        int countRight = maxDepth(root.right);


        return Math.max(countLeft, countRight) + 1;

    }

    public static void main(String[] args) {


    }

}
