import spock.lang.Specification

class TowerOfHanoiSpec extends Specification {

    TowerOfHanoi towerOfHanoi

    def 'hanoi should resolve 3 items'() {

        given:
        towerOfHanoi = new TowerOfHanoi()
        towerOfHanoi.plates << 3
        towerOfHanoi.plates << 2
        towerOfHanoi.plates << 1

        towerOfHanoi.plates.each { towerOfHanoi.towerA << it }

        when:
        towerOfHanoi.resolve()

        then:
        println "A: ${towerOfHanoi.towerA}"
        println "B: ${towerOfHanoi.towerB}"
        println "C: ${towerOfHanoi.towerC}"
        towerOfHanoi.towerC.pop() == 1
        towerOfHanoi.towerC.pop() == 2
        towerOfHanoi.towerC.pop() == 3
    }


}
