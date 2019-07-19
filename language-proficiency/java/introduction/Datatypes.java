import java.util.Scanner;

public class Datatypes
{
    public static void main(String args[])
    {
        //Read in number of test cases using stdio
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            /*
            A simple try-catch block. If the value causes an exception when being read as a long this means either the numeric
            value is too highe or isn't valid. Regardless it couldn't be stored in a long or any smaller non-floating point datatype
            and therefore the catch statement prints "x can't be fitted anywhere"

            if the value can be stored in a long then it's a simple matter of using some if statements to verify if the value is withing the min-max
            range of the smaller sized datatypes.
            */
            try
            {
                long x = scan.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x >= -32768 && x <= 32767)System.out.println("* short");
                if(x >= -2147483648 && x <= 2147483647)System.out.println("* int");
                System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
    }
}
