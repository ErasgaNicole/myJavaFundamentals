import java.util.Scanner;

public class primeChecker {

  public static void main(String[] args) {

    // User Interface
    try (
    Scanner primeScanner = new Scanner(System.in)) 
    {
      System.out.print("Please Input A Number: ");
      int userInput = primeScanner.nextInt();
      int i = 2;


      // While loop to check for prime numbers
      boolean isPrime = false;
      while (i <= userInput / 2) 
      {
        // If the loop detected a whole number then it is not a prime
        if (userInput % i == 0) 
        {
          System.out.println(i);
          isPrime = true;
          break;
        }
        ++i;
      }

      // If conditions to check if it is a prime or not
      if (isPrime == false)
        System.out.println(userInput + " is a prime number.");
      else
        System.out.println(userInput + " is not a prime number.");
    }
  }
}