package BinaryTreePaths;

import BinaryTreeInorderTraversal.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<>();
        List<Integer> num = new ArrayList<>();

        if (root == null) {
            return list;
        }

        TreeNode right = root.right;
        TreeNode left = root.left;

        num.add(root.val);

        while (left != null) {
            num.add(left.val);
            if (left.right != null){
            num.add(left.right.val);
            }
            left = left.left;
        }
        return list;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

    }
}
