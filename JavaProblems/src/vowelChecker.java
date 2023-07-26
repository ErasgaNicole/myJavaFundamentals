import java.util.Scanner;

public class vowelChecker 
{
    public static void main (String args[])
    {
        // SCANNER 
        try (Scanner vowelScanner = new Scanner(System.in))
        {
            // VARIABLES
            String userInput;
            boolean isPresent;

            // USER INTERFACE
            System.out.println("Input Random Words to check if vowels are present");
            userInput = vowelScanner.nextLine();

            // TRANSFORMS THE USER INPUT TO LOWERCASE THEN CHECK IF IT MATCHES THE VOWELS.
            isPresent = userInput.toLowerCase().matches(".*[aeiou].*");
            System.out.println(isPresent);
        };
    }
    
}
