class FirstRepeatingCharacter {

    String fetch(String s) {

        String firstRepeatingChar = findFirstRepeatingCharacter(s)

        if (firstRepeatingChar) {
            firstRepeatingChar
        } else {
            throw new NoRepeatingCharacterException()
        }

    }

    private String findFirstRepeatingCharacter(String s) {

        s.chars.find { Character c ->

            s.chars.findAll { it.toString() == c }.size() > 1
        }
    }
}
