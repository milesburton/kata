class TowerOfHanoi {

    List<Integer> plates = []

    Stack<Integer> towerA = new Stack<Integer>()
    Stack<Integer> towerB = new Stack<Integer>()
    Stack<Integer> towerC = new Stack<Integer>()

    void resolve() {

        doResolve(plates[0], towerA, towerB, towerC)
    }

    void doResolve(Integer plate, Stack<Integer> towerFrom, Stack<Integer> towerTo, Stack<Integer> towerVia) {

        if (plate == plates.last()) {
            move(towerFrom, towerTo)
        }else{

            doResolve(plate -1, towerFrom, towerVia, towerTo)
            move(towerFrom, towerTo)
            doResolve(plate-1, towerVia, towerTo, towerFrom)
        }



    }

    void move(Stack<Integer> towerFrom, Stack<Integer> towerTo) {
        towerTo.push towerFrom.pop()
    }
}

