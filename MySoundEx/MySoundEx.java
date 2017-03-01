import java.util.*;

class MySoundEx{

  //variable will store all the characters in the string
  char [] wordChar;
  //to retain the first character of of the string
  char first_char;
  //will contain the final soundEx code
  String code="";

  //Constructor
  //Takes the string input and converts the whole string
  //to capitals to be matched with the decode map in decodeChars(). 
  //Then each of the strings characters are put into an array.
  MySoundEx(String word){

    wordChar = word.toUpperCase().toCharArray();
    first_char = wordChar[0];

  }

  //function decodes the string from it's second character to the end
  //by the soundEx numeric code system.
  public void decodeChars(){

    for (int i=1;i<wordChar.length;i++){
      switch(wordChar[i]){


        case 'B':
        case 'F':
        case 'P':
        case 'V':
        wordChar[i] = '1';
        break;

        case 'C':
        case 'G':
        case 'J':
        case 'K':
        case 'Q':
        case 'S':
        case 'X':
        case 'Z':
        wordChar[i] = '2';
        break;

        case 'D':
        case 'T':
        wordChar[i] = '3';
        break;

        case 'L':
        wordChar[i] = '4';
        break;

        case 'M':
        case 'N':
        wordChar[i] = '5';
        break;

        case 'R':
        wordChar[i] = '6';
        break;

        default:
        wordChar[i] = '0';
        break;
      }
    }
  }

  //remove numbers by the sound Ex algorithm.
  public void constructCode(){
    int added = 0;
    while(added<4){
    for(int i = 1; i<wordChar.length;i++){
      if(wordChar[i] != '0' && wordChar[i] != wordChar[i-1] ){

        code = code + wordChar[i];
        added++;
      }
    }
    }

    //inserts the first character of the initial string
    code=first_char+code;


    if (code.length()<4){

      //adding zeros to fill string
      //if string is shorter than four characters
      //code = code + "0000";
      switch(code.length()){
        case 3:  code = code + "0";
        break;
        case 2:  code = code + "00";
        break;
        case 1:  code = code + "000";
        break;
        case 0:  code = code + "0000";
      }
    }

    //chops down the string length to 4 charachters
    code = code.substring(0,4);

  }

  public String toString(){

    return code;

  }

  public void printSoundExCode(){

    System.out.println(code);

  }
}
