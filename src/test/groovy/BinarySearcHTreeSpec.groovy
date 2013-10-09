import customnodes.TreeNode
import spock.lang.Shared
import spock.lang.Specification

class BinarySearcHTreeSpec extends Specification {

    @Shared LinkedList<Integer> orderRequiredForBalancedTree = new LinkedList<Integer>([50, 17, 72, 12, 23, 54, 76, 9, 14, 19, 67])
    @Shared LinkedList<Integer> orderRequiredForUnbalancedTree = new LinkedList<Integer>([9, 12, 14, 17, 19, 23, 50, 54, 67, 72, 76])

    def 'can build a tree'() {

        when:
        TreeNode root = buildTree(orderRequiredForBalancedTree)

        then:
        root.value == 50
        root.leftNode.value == 17
        root.leftNode.leftNode.value == 12
        root.leftNode.leftNode.leftNode.value == 9
        root.rightNode.value == 72
        root.rightNode.rightNode.value == 76
    }

    /* Implement a function to check if a tree is balanced  For the purposes of this question,
    a balanced tree is defined to be a tree such that no two leaf nodes differ in distance
    from the root by more than one
    */

    def 'validate if a tree is balanced (differs by no more than one child)'() {

        when:
        def isActuallyBalanced = new BalancedTreeDetector().isBalanced(root)

        then:
        isActuallyBalanced == isBalanced

        where:
        root                                      | isBalanced
        buildTree(orderRequiredForBalancedTree)   | true
        buildTree(orderRequiredForUnbalancedTree) | false


    }

    def buildTree(Collection<Integer> numbers) {

        TreeNode root = null

        numbers.each {
            if (!root) {
                root = new TreeNode(value: it)
            } else {
                root.append(new TreeNode(value: it))
            }
        }

        root
    }
}
