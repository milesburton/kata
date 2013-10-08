package linkedlists


class CustomNode<T> {

    CustomNode<T> next
    T value

    CustomNode<T> tail() {
        next ? next.tail() : this
    }


}

class CustomLinkedList<T> {

    CustomNode<T> head = null

    def insert(T node) {
        insert(new CustomNode<T>(value: node))
    }

    def insert(CustomNode<T> node) {

        if (!head) {
            head = node
        } else {
            head.tail().next = node
        }

        node
    }

}