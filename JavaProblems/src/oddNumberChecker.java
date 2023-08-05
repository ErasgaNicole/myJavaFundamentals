import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class oddNumberChecker 
{

    public static void main (String []args)
    {
        // USER INTERFACE
        try (Scanner oddScanner = new Scanner(System.in)) 
        {
            // SCANNER AND VARIABLES
            List<Integer> oddList = new ArrayList<Integer>();
            System.out.println("Indicate the size of the list");
            int listSize = oddScanner.nextInt();

            // FOR LOOP DEPENDING ON THE LIST SIZE
            for (int size = 1 ; size <= listSize; size++)
            {
                System.out.print("Value " + size + " :");
                oddList.add(oddScanner.nextInt());
            }
     
            // FOR LOOP FOR ITERATION OF THE LIST
            for(int checker : oddList)
            {

                // HOW IT WORKS?: IF THE "IF" CONDITIONS IS VISIBLE BY 2 AND RETURNS A WHOLE NUMBER IT IS EVEN
                if (checker % 2 == 0)
                {
                System.out.println("Even: " + checker);
                }

                // ELSE IT IS ODD
                else
                {
                System.out.println("Odd: " + checker);
                }
            }
        }
    }
}
