import java.util.Scanner;

// CREATED BY NICOLE C. ERASGA
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // Variables 
        String reverse = "";
        char charString;

        // My Scanner with Try to close
        try (Scanner myScanner = new Scanner(System.in)) 
        {
            // User Interface
            System.out.println("HELLO WELCOME TO THE STRING REVERSER");
            System.out.print("PLEASE INPUT THE VALUE: ");
            String myStringValue = myScanner.nextLine();
            System.out.println("THE INPUTTED VALUE IS " + myStringValue);
            
            // For Loop where it will stop once the myStringValue.length is reached (value depends on the user's input)
            for (int i = 0; i <= myStringValue.length()-1; i++ )
            {
                // Extract each character in a string
                charString = myStringValue.charAt(i);
                // Adds the extracted character to the existing string (String reverse)
                reverse = charString + reverse;
            }
        }
        // Prints the final value
        System.out.println("THE REVERSED VALUE IS " + reverse);
    }
}
