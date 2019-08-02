//Start of code segment locked by HackerRank
import java.util.Scanner;
//End of code segment locked by HackerRank

/*
The purpose of this problem is to write a basic calculator class that has a single method
to raise an input n to the power of p. It should also throw an exception if both n and p
are 0 or either is negative.

*/
class MyCalculator
{
    //Make sure the method signature includes the Exception which can be thrown
    long power(int n, int p) throws Exception
    {
        //Simple if-else statements to throw exceptions with respective messages or to return the result
        if(n == 0 && p == 0) throw new Exception("n and p should not be zero.");
        else if(n < 0 || p < 0) throw new Exception("n or p should not be negative.");
        else
        {
            return (long) Math.pow(n, p);
        }
    }
}
//Start of code segment locked by HackerRank
public class ExceptionHandling
{
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        while (in .hasNextInt())
        {
            int n = in .nextInt();
            int p = in .nextInt();

            try
            {
                System.out.println(my_calculator.power(n, p));
            }

            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
//End of code segment locked by HackerRank
