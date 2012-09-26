package FibonnaciIteration


class FibonnaciIteration {

    Integer fib(Integer n) {

        if([0,1].contains(n)) return n

        int antepenultimate = 0
        int penultimate = 1
        int ultimate = 1

        for(int fibIndex = 2; fibIndex < n; fibIndex++){

            println "${fibIndex} = ${ultimate}"

            antepenultimate = penultimate
            penultimate = ultimate
            ultimate = penultimate + antepenultimate
        }

        ultimate

    }
}
