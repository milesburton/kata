import spock.lang.Specification

class UniqueCharsInStringIterativeSpec extends Specification {

    UniqueCharsInStringIterative strings

    void setup() {
        strings = new UniqueCharsInStringIterative()
    }

    def 'string has unique characters'() {

        when:
        boolean unique = strings.isUnique(str)

        then:
        unique == isUnique

        where:
        str    | isUnique
        "abcd" | true
        "aabc" | false

    }
}
