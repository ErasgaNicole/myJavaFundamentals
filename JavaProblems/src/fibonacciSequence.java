import java.util.Scanner;

public class fibonacciSequence 
{
    public static void main (String []args)
    {
        // SCANNER
        try (Scanner fibonacciScanner = new Scanner(System.in)) 
        {
            // VARIABLES AND USER INTERFACE
            int userInput, userRange, holder, finalAnswer = 1;
            System.out.print("Please input the base number: ");
            userInput = fibonacciScanner.nextInt();
            System.out.print("Please input the how many loops/range: "); 
            userRange = fibonacciScanner.nextInt();

            // FOR LOOPS THAT DETECT THE USER INPUT AND USER RANGE
            for (int i = 0; i <= userRange; i++)
            {
                // FIRST IT STORE THE userInput into an empty variable named Holder.
                 holder = userInput;
                // Second is the userinput is then assigned to the value of the final answer.
                 userInput = finalAnswer;
                // Third is the userInput + holder is then added.
                 finalAnswer = userInput + holder;        
                // Fourth it gets printed out.
                 System.out.print(userInput +", ");
            }
        }
    }    
}
