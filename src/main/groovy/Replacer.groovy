
class Replacer {

    private char CHAR_SPACE = ' '
    private char[] CHAR_REPLACEMENT = '%20'.toCharArray()

    char[] replaceAll(char[] chars, int length) {

      for(int i = 0; i< length; i++){

          if(chars[i]==CHAR_SPACE){

              for(int j = chars.length-1; j >= i; j--){
                chars[j] = chars[j-2]
              }

              for(int j = 0; j < CHAR_REPLACEMENT.length; j++){
                  chars[i + j] = CHAR_REPLACEMENT[j]
              }


          }
      }

        chars

    }
}
