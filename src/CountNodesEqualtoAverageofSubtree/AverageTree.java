package CountNodesEqualtoAverageofSubtree;

public class AverageTree {

    public static void main(String[] args) {

        // Rootnode:
        TreeNode root = new TreeNode(4);
        TreeNode leftChildOfRoot = new TreeNode(8);
        root.left = leftChildOfRoot;

        TreeNode leftRightNode = new TreeNode(1);
        root.left.right = leftRightNode;
        TreeNode leftLeftNode = new TreeNode(0);
        root.left.left = leftLeftNode;

        TreeNode rightChildOfRoot = new TreeNode(5);
        root.right = rightChildOfRoot;
        TreeNode rightRightNode = new TreeNode(6);
        root.right.right = rightRightNode;

        AverageTree at = new AverageTree();

        at.averageOfSubtree(root);

    }

    int counterResult = 0;

    public int averageOfSubtree(TreeNode node) {

        calculateSubTrees(node);

        return counterResult;
    }

    public TreeAndCountHolder calculateSubTrees(TreeNode node) {

        // We hit a leaf node aka the bottom
        if (node.left == null && node.right == null) {
            // if the number of this node is like 4, 4/1 is 4, etc.
            counterResult++;
            TreeAndCountHolder tach = new TreeAndCountHolder();
            tach.counter = 1;
            tach.numbersAdded = node.val;
            return tach;
        }

        // Explore right
        if (node.left == null && node.right != null) {
            TreeAndCountHolder tach = new TreeAndCountHolder();
            TreeAndCountHolder tachFromRight = calculateSubTrees(node.right);

            tach.counter = 1 + tachFromRight.counter;
            tach.numbersAdded = node.val + tachFromRight.numbersAdded;

            if (tach.numbersAdded / tach.counter == node.val) {
                counterResult++;
            }

            return tach;

        }
        // Explore left
        if (node.left != null && node.right == null) {
            TreeAndCountHolder tach = new TreeAndCountHolder();
            TreeAndCountHolder tachFromLeft = calculateSubTrees(node.left);

            tach.counter = 1 + tachFromLeft.counter;
            tach.numbersAdded = node.val + tachFromLeft.numbersAdded;

            if (tach.numbersAdded / tach.counter == node.val) {
                counterResult++;
            }

            return tach;
        }

        // Last case, we have 2 children, and we made it here without returning
        TreeAndCountHolder tachFromLeft = calculateSubTrees(node.left);
        TreeAndCountHolder tachFromRight = calculateSubTrees(node.right);

        TreeAndCountHolder middleTach = new TreeAndCountHolder();

        middleTach.counter = 1 + tachFromLeft.counter + tachFromRight.counter;

        middleTach.numbersAdded = node.val + tachFromLeft.numbersAdded + tachFromRight.numbersAdded;

        if (middleTach.numbersAdded / middleTach.counter == node.val) {
            counterResult++;
        }

        return middleTach;
    }

}

class TreeAndCountHolder {

    // to find out how many nodes ive touched below me, needed to divide
    int counter;
    // to know what the total is
    int numbersAdded;
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