public class swapVariables 
{
    // BY NICOLE C. ERASGA
    // SWAP 2 VARIABLES WITHOUT USING A THIRD ONE
    public static void main(String []args)
    {
        int firstVar = 50;
        int secondVar = 10;
        System.out.println("The first value is " + firstVar + " and the Second Value is " + secondVar);

        firstVar = firstVar + secondVar; // 60
        secondVar = firstVar - secondVar; // 10
        firstVar = firstVar - secondVar; // 50

        System.out.println("The swap value is " + firstVar + " and the swap Value is " + secondVar);
    }
    
}
