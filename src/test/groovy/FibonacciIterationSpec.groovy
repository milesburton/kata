import spock.lang.Specification
import FibonnaciIteration.FibonnaciIteration

class FibonacciIterationSpec extends Specification {

    def fibonacci

    void setup() {

        fibonacci = new FibonnaciIteration()
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
        8 | 21
        9 | 34
        10 | 55
        11 | 89
        12 | 144
        13 | 233
        14 | 377
    }

}
