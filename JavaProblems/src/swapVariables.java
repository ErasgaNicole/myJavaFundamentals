import java.util.Scanner;

public class swapVariables 
{
    // BY NICOLE C. ERASGA
    // SWAP 2 INT VARIABLES WITHOUT USING A THIRD VARIABLE
    public static void main(String []args)
    {
        // FOR USER INPUT
        try (Scanner intergerScanner = new Scanner(System.in)) 
        {
            // THIS IS THE USER ITNERFACE
            System.out.print("Please enter your first integer: ");
            int firstVar = intergerScanner.nextInt();
            System.out.print("Please enter your second integer: ");
            int secondVar = intergerScanner.nextInt();

            System.out.println("The first value is " + firstVar + " and the Second Value is " + secondVar);
            // E.G 100 and 50
            // HOW THIS WORK IS THE FIRST LINE SUMS UP THE TWO VALUE
            firstVar = firstVar + secondVar; // 100 + 50 = 150
            // THIS NEXT LINE SUBTRACTS THE SUMPS UP VALUE TO THE SECOND LINE
            secondVar = firstVar - secondVar; // 150 - 50 = 100
            // THIS NEXT LINE SUBTRACTS FROM THE PREVIOUS VALUE 
            firstVar = firstVar - secondVar;  //  150 - 100 = 50
            System.out.println("The first value now is " + firstVar + " and the Second now Value is " + secondVar);
        }
    }
    
}
