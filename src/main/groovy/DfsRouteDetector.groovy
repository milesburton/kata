import customnodes.CustomNode
import groovy.transform.CompileStatic

@CompileStatic
class DfsRouteDetector {

    Set<CustomNode> visitedNodes = new HashSet<CustomNode>()
    Stack<CustomNode> tempList = new Stack<CustomNode>()
    CustomNode target


    boolean findRouteFromTo(CustomNode nodeA, CustomNode nodeB) {

        println "DFS"

        tempList.push(nodeA)
        target = nodeB
        findRoute()
    }

    private boolean findRoute() {

        while (!tempList.empty()) {

            def nodeUnderSearch = tempList.pop()
            println "Searching ${nodeUnderSearch.name}"
            visitedNodes.add(nodeUnderSearch)

            if (nodeUnderSearch == target) {
                println "======================="
                println "FOUND"
                println "======================="
                return true
            }

            def unvisitedChildren = nodeUnderSearch.adjecents.findAll { !visitedNodes.contains(it) }
            tempList.addAll(unvisitedChildren)
        }

        return false
    }
}
