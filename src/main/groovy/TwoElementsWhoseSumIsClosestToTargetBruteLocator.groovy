class TwoElementsWhoseSumIsClosestToTargetBruteLocator {

    List<Integer> bestPairSoFar = null

    List locate(List<Integer> unsortedList, Integer target, Integer subjectOffset = 0) {

        if(subjectOffset==unsortedList.size()){
            return
        }

        for (int i = 0; i < unsortedList.size(); i++) {

            if (i != subjectOffset) {
                checkBest(target, unsortedList[subjectOffset], unsortedList[i])
            }
        }

        locate(unsortedList, target, subjectOffset + 1)

        bestPairSoFar
    }

    void checkBest(Integer target, int x, int y) {

        List<Integer> potentialPair = [x, y]

        if (!bestPairSoFar) {
            bestPairSoFar = potentialPair
        } else {
            Integer potentialNewBest = Math.abs(target - potentialPair.sum())
            Integer bestDifferenceSoFar = Math.abs(target - bestPairSoFar.sum())
            if (potentialNewBest < bestDifferenceSoFar) {
                bestPairSoFar = potentialPair
            }
        }
    }


}
