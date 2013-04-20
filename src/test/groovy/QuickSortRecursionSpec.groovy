import spock.lang.*


class QuickSortRecursionSpec extends Specification {

    QuickSortRecursion sorter

    void setup(){

        sorter = new QuickSortRecursion()
    }

    def "should sort from lowest to highest"() {

        given:
        int[] sortable = [9,7,14,1,5,6]
        sorter.integers = sortable

        when:
        sorter.sort(0, sortable.length-1)

        then:
        sorter.integers == [1,5,6,7,9,14]
    }

}