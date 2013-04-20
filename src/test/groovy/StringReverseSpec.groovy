import spock.lang.Unroll
import spock.lang.Specification

class StringReverseSpec extends Specification{

    StringReverse reverse

    void setup() {
        reverse = new StringReverse()
    }

    @Unroll
    def '#exampleString should be reversed as #reversedString'() {

        when:
        String a = reverse.reverse(exampleString)

        then:
        reversedString == a

        where:
        exampleString | reversedString
        'abc'         | 'cba'
        'hello'       | 'olleh'
        'a'           | 'a'
        'ab'          | 'ba'
    }
}
