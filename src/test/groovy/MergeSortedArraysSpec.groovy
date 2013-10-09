import spock.lang.Specification

class MergeSortedArraysSpec extends Specification {

    def 'given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B. '() {

        given:
        def merger = new SortedArrayMerger()

        and:
        def arr1 = [1, 2, 5, 6, 7, null, null, null, null]
        def arr2 = [3, 4, 8, 9]

        when:
        def sortedArray = merger.merge(arr1,arr2)

        then:
        sortedArray == [1,2,3,]

    }
}
