import customnodes.CustomNode
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class GraphRouteBetweenTwoNodesSpec extends Specification {

    // Root
    @Shared CustomNode n1 = new CustomNode('1')

    // n1
    @Shared CustomNode n7 = new CustomNode('7')
    @Shared CustomNode n2 = new CustomNode('2')
    @Shared CustomNode n8 = new CustomNode('8')

    // n8 > n1
    @Shared CustomNode n9 = new CustomNode('9')
    @Shared CustomNode n12 = new CustomNode('12')

    // n 9 > 8 > 1
    @Shared CustomNode n10 = new CustomNode('10')
    @Shared CustomNode n11 = new CustomNode('11')

    // n2 > 1
    @Shared CustomNode n3 = new CustomNode('3')
    @Shared CustomNode n6 = new CustomNode('6')

    // Parent CustomNode 3 > 2 > 1
    @Shared CustomNode n4 = new CustomNode('4')
    @Shared CustomNode n5 = new CustomNode('5')

    def 'setup'(){
    // www.programmerinterview.com/images/DFS.png

        n1.append(n7)
        n1.append(n2)
        n1.append(n8)

        n8.append(n9)
        n8.append(n12)

        n9.append(n10)
        n9.append(n11)

        n2.append(n3)
        n2.append(n6)

        n3.append(n4)
        n3.append(n5)
    }

    @Unroll
    def 'expect route possible #expectedToFindRoute from #nodeA.name to #nodeB.name'() {


        when:
        def foundRoute = alg.findRouteFromTo(nodeA, nodeB)


        then:
        foundRoute == expectedToFindRoute

        where:
        nodeA | nodeB | expectedToFindRoute | alg
        n5    | n2    | false               | new BFSRouteDetector()
        n4    | n12   | false               | new BFSRouteDetector()
        n1    | n7    | true                | new BFSRouteDetector()
        n5    | n2    | false               | new DfsRouteDetector()
        n4    | n12   | false               | new DfsRouteDetector()
        n1    | n7    | true                | new DfsRouteDetector()
    }

}
