import spock.lang.Specification
import spock.lang.Unroll

class TitleCapitalizationKataSpec extends Specification {

    TitleCapitalizationKata titleCapitalizationKata

    def 'setup'() {
        titleCapitalizationKata = new TitleCapitalizationKata()
    }

    @Unroll
    def "#title should be capitalised to: #expectedTitle"() {

        when:
        def actualTitle = titleCapitalizationKata.capitalize(title)

        then:
        expectedTitle == actualTitle

        where:
        title          | expectedTitle
        'miles'        | 'Miles'
        'miles burton' | 'Miles Burton'
        'mIlEs'        | 'Miles'
        'MiLeS bURtoN' | 'Miles Burton'
        'm Burton'     | 'M Burton'
    }

    @Unroll
    def "#title should be capitalised to: #expectedTitle while stop words remain lower case"() {

        when:
        def actualTitle = titleCapitalizationKata.capitalize(title)

        then:
        expectedTitle == actualTitle

        where:
        title                                   | expectedTitle
        'i love solving problems and it is fun' | 'I Love Solving Problems and It Is Fun'
        'wHy DoeS A biRd Fly?'                  | 'Why Does A Bird Fly?'
    }


}
