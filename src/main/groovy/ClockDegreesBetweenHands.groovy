class ClockDegreesBetweenHands {

    private static final double DEGREES_IN_CIRCLE = 360.0


    BigDecimal degreesBetween(int hourHand, int secondHand) {

        double secondHandInDegrees = calculateDegreesGivenSeconds(secondHand)
        double hoursHandInDegrees = calculateDegreesGivenHours(hourHand)

        double degreesBetween = calculateDegreesBetween(secondHandInDegrees, hoursHandInDegrees)

        degreesBetween % DEGREES_IN_CIRCLE ? degreesBetween : 0
    }

    private double calculateDegreesBetween(double secondHandInDegrees, double hoursHandInDegrees) {

        double pointSmallest = Math.min(secondHandInDegrees, hoursHandInDegrees)
        double pointLargest = Math.max(secondHandInDegrees, hoursHandInDegrees)

        pointLargest - pointSmallest
    }

    private double calculateDegreesGivenHours(int hourHand) {
        (DEGREES_IN_CIRCLE / 12) * hourHand
    }

    private double calculateDegreesGivenSeconds(int secondHand) {
        (DEGREES_IN_CIRCLE / 60) * secondHand
    }
}
