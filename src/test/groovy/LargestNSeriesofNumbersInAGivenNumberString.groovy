import spock.lang.Specification
import spock.lang.Unroll

class LargestNSeriesofNumbersInAGivenNumberString extends Specification {


    @Unroll
    def "Expect #expectedLargestNumber as the largest sequence of #numberOfCharacters within #inputString"() {

        given:
        def locator = new LargestNumberInAString()

        when:
        def actual = locator.findLargestNumber(numberOfCharacters, inputString)

        then:
        actual == expectedLargestNumber

        where:
        inputString                                                                            | numberOfCharacters | expectedLargestNumber
        "0009"                                                                                 | 1                  | 9
        "0099"                                                                                 | 2                  | 99
        "0110"                                                                                 | 2                  | 11
        "000000000000044443432023023050450430543050435034053488880000345043504305043503450435" | 5                  | 88880
    }
}
