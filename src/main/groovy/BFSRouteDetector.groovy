import customnodes.CustomNode
import groovy.transform.CompileStatic

@CompileStatic
class BFSRouteDetector {

    Set<CustomNode> visitedNodes = new HashSet<CustomNode>()
    LinkedList<CustomNode> tempList = new LinkedList<CustomNode>()
    CustomNode target


    boolean findRouteFromTo(CustomNode nodeA, CustomNode nodeB) {

        println ""
        println "BFS"

        tempList.push(nodeA)
        target = nodeB
        findRoute()
    }

    private boolean findRoute() {


        while (!tempList.empty) {

            def nodeUnderSearch = tempList.pop()
            println "Searching ${nodeUnderSearch.name}"
            visitedNodes.add(nodeUnderSearch)

            def unvisitedAdjacents = nodeUnderSearch.adjecents.findAll { !visitedNodes.contains(it) }

            if (unvisitedAdjacents.contains(target)) {
                println "======================="
                println "FOUND"
                println "======================="
                return true
            }
            tempList.addAll(unvisitedAdjacents)

        }

         return false
    }
}
