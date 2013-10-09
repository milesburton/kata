import customnodes.TreeNode

class BalancedTreeDetector {

    boolean isBalanced(TreeNode root) {

        return maxDepth(root) - minDepth(root) < 2
    }

    Integer maxDepth(TreeNode node) {

        if (node == null)
            return 0

        1 + Math.max(maxDepth(node.leftNode), maxDepth(node.rightNode))
    }

    Integer minDepth(TreeNode node) {

        if (node == null)
            return 0

        1 + Math.min(minDepth(node.leftNode), minDepth(node.rightNode))
    }

}
