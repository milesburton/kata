class ClockDegreesBetweenHands {


    double degreesBetween(int hourHand, int secondHand) {

        int secondHandInDegrees = (360 / 60) * secondHand
        int hoursHandInDegrees = (360 / 12) * hourHand

        if (hoursHandInDegrees > secondHandInDegrees) {
            hoursHandInDegrees - secondHandInDegrees % 360
        } else {
            secondHandInDegrees - hoursHandInDegrees % 360
        }
    }
}
