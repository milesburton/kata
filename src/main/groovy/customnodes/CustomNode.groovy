package customnodes

class CustomNode {

    CustomNode parent = null
    Set<CustomNode> adjecents = new HashSet<CustomNode>()
    String name

    CustomNode(String name) {
        this.name = name
    }

    void append(CustomNode childNode) {
        adjecents.add(childNode)
        childNode.parent = this
    }

}
