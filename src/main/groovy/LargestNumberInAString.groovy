class LargestNumberInAString {

    def findLargestNumber(int numberOfCharacters, String digits) {

        Long largestNumber = null

        0.upto(digits.length()) { def i ->

            def offsetEnd = i + numberOfCharacters
            if (offsetEnd <= digits.length()) {

                Long potentialLargestNumber = digits.substring(i, offsetEnd).toLong()

                if (!largestNumber || potentialLargestNumber > largestNumber) {
                    largestNumber = potentialLargestNumber
                }
            }

        }

        largestNumber
    }


}
