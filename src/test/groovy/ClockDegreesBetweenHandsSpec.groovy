import spock.lang.Specification

class ClockDegreesBetweenHandsSpec extends Specification {

    def clockDegreesBetweenHands

    void setup() {

        clockDegreesBetweenHands = new ClockDegreesBetweenHands()
    }

    def "given the hour hand is #h and the second hand is #s expect degrees between to be #d"() {

        when:
        def calculatedDegrees = clockDegreesBetweenHands.degreesBetween(h, s)

        then:
        calculatedDegrees == d

        where:
        h | s  | d
        6 | 30 | 0
        6 | 15 | 90
        12 | 0 | 0
        3 | 45 | 180
    }
}