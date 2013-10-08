package linkedlists

import spock.lang.Specification

class CustomNodeSoec extends Specification {

    def 'construct'() {

        given:
        def customNode = new CustomNode<Integer>(value: 1)

        expect:
        customNode.value == 1

        and:
        customNode.next == null

        and:
        customNode.tail() == customNode
    }
}
