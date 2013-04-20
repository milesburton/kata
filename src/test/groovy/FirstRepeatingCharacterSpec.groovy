import spock.lang.Specification
import spock.lang.Unroll

class FirstRepeatingCharacterSpec extends Specification {

    FirstRepeatingCharacter firstUniqueCharacterInString

    void setup() {
        firstUniqueCharacterInString = new FirstRepeatingCharacter()
    }

    @Unroll
    def 'the first repeating character in #word is #character'() {

        when:
        String c = firstUniqueCharacterInString.fetch(word)

        then:
        c == character

        where:
        word    | character
        'sally' | 'l'
        'snoopy' | 'o'
    }

    def 'first repeating character when no repeating character'(){

        when:
        firstUniqueCharacterInString.fetch('miles')

        then:
        thrown(NoRepeatingCharacterException)
    }
}
