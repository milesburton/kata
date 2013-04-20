
class StringReverse {


    String reverse(String s) {

       char[] chars  =s.chars
       int i = 0
       int y  = s.length() -1

        while(i<y){

            char tmp = chars[y]
            chars[y] = chars[i]
            chars[i] = tmp

            i++
            y--
        }

        chars.toString()
    }
}
