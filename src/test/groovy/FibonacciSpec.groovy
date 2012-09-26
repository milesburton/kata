import spock.lang.*


class FibonacciSpec extends Specification {

    Fibonnaci fibonacci

    void setup() {

        fibonacci = new Fibonnaci()
    }

    def "fibonacci #n is #p"() {

        when:
        def result = fibonacci.fib(n)

        then:
        p == result

        where:
        n | p
        0 | 0
        1 | 1
        2 | 1
        3 | 2
        4 | 3
        5 | 5
        6 | 8
        7 | 13
    }

}
