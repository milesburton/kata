class QuickSortRecursion {

    int[] integers

    void sort(int low, int high) {

        println integers
        println "${low} and ${high}"

        int lowerBound = low
        int upperBound = high

        int pivotIndex = low + (high - low) / 2
        int pivot = integers[pivotIndex]

        while (lowerBound <= upperBound) {

            println integers
            while (integers[lowerBound] < pivot) {
                println integers[lowerBound]
                lowerBound++
            }

            while (integers[upperBound] > pivot) {
                println integers[upperBound]
                upperBound--
            }

            if (lowerBound <= upperBound) {

                swap(lowerBound, upperBound)
                lowerBound++
                upperBound--
            }
        }

        if (low < upperBound)
            sort(low, upperBound)

        if (lowerBound < high)
            sort(lowerBound, high)
    }

    private void swap(int indexA, int indexB) {

        int oldIndexA = integers[indexA]

        integers[indexA] = integers[indexB]
        integers[indexB] = oldIndexA
    }


}