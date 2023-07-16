import java.util.Scanner;

public class vowelChecker 
{
    public static void main (String args[])
    {
        try (Scanner vowelScanner = new Scanner(System.in))
        {
            String userInput;
            boolean isPresent;

            System.out.println("Input Random Words to check if vowels are present");
            userInput = vowelScanner.nextLine();

            isPresent = userInput.toLowerCase().matches(".*[aeiou].*");
            System.out.println(isPresent);
        };
    }
    
}
