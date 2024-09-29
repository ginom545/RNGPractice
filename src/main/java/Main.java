// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Random;

public class Main 
{
  public static void main(String[] args) 
  {
    
    /*
    // generate a random integer between 5 and 15
    Random random = new Random();

    for (int i = 0; i < 10; i++)
    {
      int randomNum = random.nextInt(11) + 5;
      System.out.println("Random int btwn 5 & 15: " + randomNum);
    }

    // generate a random double between -8 and 3
    for (int i = 0; i < 10; i++)
    {
      double randomDouble = random.nextDouble() * 11 - 8;
      System.out.println("Random double btwn -8 & 3: " + randomDouble);
    }
    */
    System.out.println("getRandomInt:");
    System.out.println(getRandomInt(1,3));
    System.out.println(getRandomInt(10,20));
    System.out.println(getRandomInt(-13,-7));
    System.out.println("getRandomDouble:");
    System.out.println(getRandomDouble(1,3));
    System.out.println(getRandomDouble(10,20));
    System.out.println(getRandomDouble(-13,-7));
  }

  // create a public static int function called getRandomInt
  // this function should accept two parameters:
  // int low
  // int high
  // the goal will be to generate a random integer in the range [low, high] (inclusive of both)
  // and then return that value generated

  public static int getRandomInt(int low, int high)
  {
    Random random = new Random();
    
    // between 0 and high - low
    // add low to shift it between low and high
    int randomNumber = random.nextInt(high - low + 1) + low;

    return randomNumber;
  }


  // create a public static double function called getRandomDouble
  // this function should accept two parameters:
  // double low
  // double high
  // the goal will be to generate a random double in the range [low, high) 
  // (inclusive of low, exclusive of high)
  // and then return that value generated

  public static double getRandomDouble(double low, double high)
  {
    Random random = new Random();

    // between 0 inclusive and (high - low) exclusive
    // + low shifts range btwn low and high exclusive
    double randomDouble = random.nextDouble() * (high - low) + low;

    return randomDouble;
  }
  
}