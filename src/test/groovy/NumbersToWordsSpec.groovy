import spock.lang.Specification
import spock.lang.Unroll

class NumbersToWordsSpec extends Specification {

    NumbersToWords numbersToWords

    void setup() {
        numbersToWords = new NumbersToWords()
    }

    @Unroll
    def 'less than 20: #number should translate to #word'() {

        when:
        String a = numbersToWords.fetch(number)

        then:
        a == word

        where:
        number | word
        1      | 'one'
        2      | 'two'
        3      | 'three'
        4      | 'four'
        5      | 'five'
        6      | 'six'
        7      | 'seven'
        8      | 'eight'
        9      | 'nine'
        10     | 'ten'
        11     | 'eleven'
        12     | 'twelve'
        13     | 'thirteen'
        14     | 'fourteen'
        15     | 'fifthteen'
        16     | 'sixteen'
        17     | 'seventeen'
        18     | 'eightteen'
        19     | 'nighteen'
    }

    @Unroll
    def 'tens: #number should translate to #word'() {
        when:
        String a = numbersToWords.fetch(number)

        then:
        a == word

        where:
        number | word
        20     | 'twenty'
        30     | "thirty"
        40     | "fourty"
        50     | 'fifty'
        60     | 'sixty'
        70     | 'seventy'
        80     | 'eighty'
        90     | 'ninety'
    }

    @Unroll
    def 'compound tens: #number should translate to #word'() {
        when:
        String a = numbersToWords.fetch(number)

        then:
        a == word

        where:
        number | word
        21     | 'twenty one'
        22     | 'twenty two'
        23     | 'twenty three'
        24     | 'twenty four'
        25     | 'twenty five'
        26     | 'twenty six'
        27     | 'twenty seven'
        28     | 'twenty eight'
        29     | 'twenty nine'
    }

    @Unroll
    def 'hundreds: #number should translate to #word'() {
        when:
        String a = numbersToWords.fetch(number)

        then:
        a == word

        where:
        number | word
        100    | 'one hundred'
        101    | 'one hundred one'
        400    | 'four hundred'
        999    | 'nine hundred ninety nine'
    }

}
