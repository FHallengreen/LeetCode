package MinimumDepthBinaryTree;

import BinaryTreeInorderTraversal.TreeNode;

public class Solution {

    public int minDepth(TreeNode root) {


        if (root == null) {
            return 0;
        }

        int countLeft = minDepth(root.left);
        int countRight = minDepth(root.right);

        if (countLeft == 0){
            return countRight + 1;
        }
        else if (countRight == 0){
            return countLeft + 1;
        }
    else {
            return Math.min(countLeft, countRight) + 1;
        }

    }
}
