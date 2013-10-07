import spock.lang.Specification
import spock.lang.Unroll

class TwoElementsWhoseSumIsClosestToZeroSpec extends Specification {

    @Unroll
    def 'given #unsortedList the lowest value to zero is #expectedPair - hairy brute'() {

        given:
        def locator = new TwoElementsWhoseSumIsClosestToTargetBruteLocator()

        when:
        def actualPair = locator.locate(unsortedList, target)

        then:
        actualPair == expectedPair

        where:
        unsortedList          | expectedPair | target
        [0, 2, -10, 10, 5, 4] | [-10, 10]    | 0
        [-100, -2, 1, 97]     | [-2, 1]      | 0

    }

    @Unroll
    def 'given #unsortedList the lowest value to zero is #expectedPair - using sort'() {

        given:
        def locator = new TwoElementsWhoseSumIsClosestToTargetSortLocator()

        when:
        def actualPair = locator.locate(unsortedList, target)

        then:
        actualPair.containsAll expectedPair

        where:
        unsortedList          | expectedPair | target
        [0, 2, -10, 10, 5, 4] | [-10, 10]    | 0
        [-100, -2, 1, 97]     | [-2, 1]      | 0
    }


}
