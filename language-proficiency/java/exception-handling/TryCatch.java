/*
This problem should try to divide to integers and throw an error
if the divisor is zero.

To print out the by zero of the exception instead of just the canonical name
a simple if statement is used to modify it before printing.
*/

import java.util.Scanner;

public class TryCatch
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        String str;
        try
        {
            int x = scan.nextInt(), y = scan.nextInt();
            System.out.println(x / y);
        }
        catch(Exception e)
        {
            str = e.getClass().getCanonicalName();
            if(str.equals("java.lang.ArithmeticException")) str += ": / by zero";
            System.out.println(str);
        }

    }
}
