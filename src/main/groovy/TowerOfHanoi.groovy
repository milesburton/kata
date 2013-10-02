
class TowerOfHanoi {

    Queue<String> moves = new LinkedList<String>()

    void resolve(int plate, String from, String to, String via) {

        if (plate > 0) {

            resolve(plate - 1, from, via, to)
            move(plate, from, to)
            resolve(plate - 1, via, to, from)
        } else {
            move(plate, from, to)
        }
    }

    private void move(int plate, String from, String to) {
        moves.add "Moving ${plate} $from $to"
    }
}
