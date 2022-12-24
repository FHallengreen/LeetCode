package BinaryTreeInorderTraversal;

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
/*

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        return null;
    }

    public static void main(String[] args) {

    }
}
*/
