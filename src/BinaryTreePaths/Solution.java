package BinaryTreePaths;

import BinaryTreeInorderTraversal.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        treeRecursion(root, "", paths);
        return paths;
    }

    private void treeRecursion(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null) {
            paths.add(path + node.val + "");
            return;
        }
        if (node.left != null) {
            treeRecursion(node.left, path + node.val + "->", paths);
        }
        if (node.right != null) {
            treeRecursion(node.right, path + node.val + "->", paths);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(5);
        Solution solution = new Solution();
        System.out.println(solution.binaryTreePaths(root));
    }
}
