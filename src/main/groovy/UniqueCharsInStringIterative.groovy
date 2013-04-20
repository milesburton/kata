

class UniqueCharsInStringIterative {

    boolean isUnique(String s) {


        s.chars.findAll { count(s.chars, it) > 1 }.size() == 0


    }


    int count(char[] chars, char c){

        chars.findAll { it == c }.size()
    }
}
