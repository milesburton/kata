import linkedlists.BrokenSingleLinkedListDetector
import linkedlists.CustomLinkedList
import spock.lang.Specification

class BrokenSingleLinkedListDetectorSpec extends Specification {

    def 'Given a circular linked list, implement an algorithm which returns node at the beginning of the loop'() {

        given:
        def detector = new BrokenSingleLinkedListDetector()

        def list = new CustomLinkedList<Integer>()

        def head = list.insert(1)
        list.insert(2)
        list.insert(head) // This is now circular

        when:
        def headNode = detector.fetchHead(list)

        then:
        headNode.value == 1

    }
}
