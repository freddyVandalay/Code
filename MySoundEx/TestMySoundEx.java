//Main program to test MySoundEx.java

import java.util.Scanner;

class TestMySoundEx{
  public static void main(String[] args)
  {
    String word;
    MySoundEx test;
    Scanner userInput;

    //UI
    System.out.println("----testMySoundEx----");
    System.out.println("Input a string to decode: ");
    userInput = new Scanner(System.in);
    word = userInput.next();
    
    //Decode 
    test = new MySoundEx(word);
    test.decodeChars();
    test.constructCode();
    test.printSoundExCode();


  }
}
