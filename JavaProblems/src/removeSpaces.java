import java.util.Scanner;

public class removeSpaces 
{
    public static void main (String []args)
    {
        // USER INTERFACE 
        String userInput,finalOutput;
        try (Scanner removeSpace = new Scanner(System.in)) 
        {
            System.out.print("Please input your word: ");
            userInput = removeSpace.nextLine();
        }
        // Basically, it replaces all spaces " " with a without space string ""
        finalOutput = userInput.replaceAll(" ", "");
        System.out.println(finalOutput);

    }
    
}
