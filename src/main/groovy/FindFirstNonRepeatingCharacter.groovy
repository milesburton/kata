


class FindFirstNonRepeatingCharacter {
    String fetch(String s) {

        s.chars.find {
            Character c ->

            s.chars.findAll { it.toString() == c }.size() == 1
        }

    }
}
