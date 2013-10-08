package linkedlists

class BrokenSingleLinkedListDetector {

    HashSet<CustomNode<Integer>> parents = new LinkedList<>()

    CustomNode<Integer> fetchHead(CustomLinkedList<Integer> list) {

        checkCircular(list.head)
    }

    CustomNode<Integer> checkCircular(CustomNode<Integer> node){

        if(parents.contains(node)){
            return node
        }

        parents.add(node)
        checkCircular(node.next)
    }
}
