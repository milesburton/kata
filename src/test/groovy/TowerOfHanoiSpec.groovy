import spock.lang.Specification

class TowerOfHanoiSpec extends Specification {

    TowerOfHanoi towerOfHanoi = new TowerOfHanoi()

    def 'hanoi should resolve 3 items'() {

        given:
        String towerOfHanoi

        expect:
        resolve(3, 'a', 'b', 'c')
    }




}
