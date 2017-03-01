import java.util.Scanner;

class testMyLevensthein{
  public static void main(String[] args)
  {
  	System.out.println("----CHECK YOUR STRINGS----");
  	System.out.println("This program is using the Levensthein algorithm");
  	System.out.println("to compute the distance between to strings");
  	
  	System.out.print("Input a string: ");
    Scanner userInput = new Scanner(System.in);
    String word1 = userInput.next();

    System.out.print("Input another string: ");
    userInput = new Scanner(System.in);
    String word2 = userInput.next();

    MyLevensthein test = new MyLevensthein(word1,word2);
    System.out.println("The distance between the two strings are: " + test.distance());


  }
}
