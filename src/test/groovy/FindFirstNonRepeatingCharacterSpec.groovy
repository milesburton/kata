import spock.lang.Specification

class FindFirstNonRepeatingCharacterSpec extends Specification {

    FindFirstNonRepeatingCharacter findFirstNonRepeatingCharacter

    void setup(){
        findFirstNonRepeatingCharacter = new FindFirstNonRepeatingCharacter()
    }

    def 'the first non repeating character in #word is #character'(){

        when:
        String c = findFirstNonRepeatingCharacter.fetch(word)

        then:
        c == character

        where:
        word | character
        'sally' | 's'
        'lloyd' | 'o'
    }

}
