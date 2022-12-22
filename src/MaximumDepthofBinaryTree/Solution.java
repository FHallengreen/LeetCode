package MaximumDepthofBinaryTree;

import BinaryTreeInorderTraversal.TreeNode;

public class Solution {

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int countLeft = maxDepth(root.left);
        int countRight = maxDepth(root.right);

        return Math.max(countLeft, countRight) + 1;

    }

/*    public int calculateDepth(TreeNode root) {
        int countLeft = 0;
        int countRight = 0;

        if (root != null) {

            if (root.left != null) {
                countLeft++;
                calculateDepth(root.left);
            }
            if (root.right != null) {
                countRight++;
                calculateDepth(root.right);
            }
        }
        return Math.max(countLeft, countRight);

    }*/

}
