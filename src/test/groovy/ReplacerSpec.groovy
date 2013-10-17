import spock.lang.Specification

class ReplacerSpec extends Specification {

    Replacer replacer

    def 'setup'() {
        replacer = new Replacer()
    }

    // Write a method to replace all spaces in a string with '%20'.
    // Assume string has sufficient space at end of string to hold additional characters, and that you're given a true length of a string.
    def "Write a method to replace all spaces in a string with '%20'."() {

        given:
        String trueString = "Some something something"
        char[] aString = "${trueString}    ".toCharArray()
        char[] expectedChars = "Some%20something%20something"

        when:
        def actualChars  = replacer.replaceAll(aString, trueString.length())

        then:
        expectedChars == actualChars
    }
}
