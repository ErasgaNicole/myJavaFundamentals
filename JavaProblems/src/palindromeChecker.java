import java.util.Scanner;

public class palindromeChecker 
{
    // WHAT IS A PALINDROME? a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.
    public static void main (String [] args)
    {
        // Variables and the User Interface
        String userInput;
        System.out.println("Please enter your input: ");
        try (Scanner palindromeScanner = new Scanner(System.in)) 
        {
            userInput = palindromeScanner.nextLine();
        }

        // How it works? Basically it extracts the half the characters of the user input then compares it to reverse half of the input.
        for (int letters = 0; letters < userInput.length()/2;)
        {
            // condition statement e.g madam, first 3 letters are mad and the reverse is mad too therefore it is true
            if (userInput.charAt(letters) == userInput.charAt(userInput.length() - letters - 1))
            {
                System.out.println("The input a palindrome.");
            }    
            // if it not the exact match therefore it is false.
            else
            {
                System.out.println("The input is not a palindrome.");
            }
            break;
        }
    }
}