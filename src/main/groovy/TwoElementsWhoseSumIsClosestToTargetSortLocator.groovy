class TwoElementsWhoseSumIsClosestToTargetSortLocator {
    def locate(List<Integer> arr, Integer target) {

        List<Integer> sortedArr = arr.sort { a, b -> Math.abs(a) - Math.abs(b) }

        int i = 0
        List<Integer> bestPair = []
        Integer bestDifference = null

        while(i < sortedArr.size()){

            int a = sortedArr[i]
            int b = sortedArr[i+1]
            List<Integer> potentialPair = [a,b]
            int potentialBestDifference = calculateDifference(target, potentialPair)


            if(!bestPair || bestDifference > potentialBestDifference){
                bestPair = potentialPair
                bestDifference = potentialBestDifference
            }

            i = i +2
        }

        bestPair
    }

    Integer calculateDifference(Integer target, List<Integer> pair){
        Math.abs(target - pair.sum())
    }
}
