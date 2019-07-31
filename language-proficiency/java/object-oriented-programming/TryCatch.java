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
