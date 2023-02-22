package CountNodesEqualtoAverageofSubtree;

import BinaryTreeInorderTraversal.TreeNode;

public class Solution {

        public int averageOfSubtree(TreeNode root) {
            return countNodesHelper(root, 0);
        }

    private int getSubtreeSize(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSubtreeSize(node.left) + getSubtreeSize(node.right);
    }

    private int countNodesHelper(TreeNode node, int parentAvg) {
        if (node == null) {
            return 0;
        }

        int subtreeSum = node.val;
        int subtreeSize = 1;
        if (node.left != null) {
            subtreeSum += countNodesHelper(node.left, parentAvg);
            subtreeSize += getSubtreeSize(node.left);
        }
        if (node.right != null) {
            subtreeSum += countNodesHelper(node.right, parentAvg);
            subtreeSize += getSubtreeSize(node.right);
        }

        int subtreeAvg = subtreeSum / subtreeSize;
        if (node.val == subtreeAvg) {
            return 1 + countNodesHelper(node.left, subtreeAvg) + countNodesHelper(node.right, subtreeAvg);
        } else {
            return countNodesHelper(node.left, subtreeAvg) + countNodesHelper(node.right, subtreeAvg);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(6);


        Solution solution = new Solution();
        int result = solution.averageOfSubtree(root);
        System.out.println(result);
    }

}
