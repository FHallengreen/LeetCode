package sameTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (q == null && p == null) {
            return true;
        } else if (q == null || p == null) {
            return false;
        }

        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        TreeNode p = new TreeNode();

        System.out.println(isSameTree(new TreeNode(), new TreeNode()));

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }


    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}