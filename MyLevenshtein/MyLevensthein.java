

public class MyLevensthein{


  private int incDistance=1; //Adds one to the current distance
  private char [] word1_char;
  private char [] word2_char;
  private int [][] distanceMatrix;


  //Constructor 
  //Takes two string as an input
  MyLevensthein(String word1, String word2){

    //converting both strings to capitals
    //which will allow for comparing characters
    word1_char = word1.toUpperCase().toCharArray();
    word2_char = word2.toUpperCase().toCharArray();


    distanceMatrix = new int[word1_char.length+1][word2_char.length+1];
  }

  public int distance(){

    //This is the base case. If any of the strings would be empty
    /*if ( wordChar1.length == 0) {

      return wordChar2.length;

    } else if (wordChar2.length == 0) {

      return wordChar1.length;

    }
    */

    //building the y axis frame.
    //represents the first string input
    for (int i = 0; i < word1_char.length+1; i++){

      distanceMatrix[i][0] = i;

    }

    //building the x axis fram.
    //represents the second string input
    for (int j = 0; j < word2_char.length+1; j++)
    {

      distanceMatrix[0][j] = j;

    }

    //iterate through the distanceMatrix
    //Y-axis
    for (int i=1;i<word1_char.length+1;i++){
      //X-axis
      for(int j=1;j<word2_char.length+1;j++){

        if(word1_char[i-1]==word2_char[j-1]){

          distanceMatrix[i][j]=distanceMatrix[i-1][j-1];

        }
        else{

          distanceMatrix[i][j]=minimum(distanceMatrix[i-1][j-1],distanceMatrix[i][j-1],distanceMatrix[i-1][j]) + incDistance;

        }

      }
    }
    
    //Visualise the distance matrix
    display();
    System.out.println();
    
    return distanceMatrix[word1_char.length][word2_char.length];
  }

  //returns the minimum value of three integers
  public int minimum(int one, int two, int three){

    int mini=one;

    if(two<mini){

      mini=two;

    }
    if(three<mini){

      mini=three;

    }

    return mini;

  }

  //Displays the distance matrix
  public void display(){
    System.out.println();
    System.out.println("Distance matrix visualiser");
    //iterate through the distanceMatrix
    for (int i=0;i<word1_char.length+1;i++){
      System.out.println();
      for(int j=0;j<word2_char.length+1;j++){


        System.out.print(distanceMatrix[i][j]);
      }
    }
  }

}
