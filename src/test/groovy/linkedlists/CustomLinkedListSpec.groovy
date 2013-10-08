package linkedlists

import spock.lang.Specification

class CustomLinkedListSpec extends Specification {

    def 'construct'(){
        given:
        def ll = new CustomLinkedList()

        expect:
        !ll.head
    }

    def 'insert'(){

        given:
        def ll = new CustomLinkedList<Integer>()

        when:
        def node = ll.insert(1)

        then:
        node.value == 1

        and:
        ll.head.value == 1

        and:
        ll.head.next == null
    }
}
