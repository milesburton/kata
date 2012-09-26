class Fibonnaci {

    Integer fib (Integer n) {

        if ([0, 1].contains(n)) return n

        return fib(n - 1) + fib(n - 2)
    }
}
