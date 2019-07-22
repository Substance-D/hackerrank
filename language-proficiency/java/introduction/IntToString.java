//Start of code segment locked by HackerRank
import java.util.*;
import java.security.*;
public class IntToString
{
    public static void main(String[] args)
    {
         DoNotTerminate.forbidExit();
         try
         {
             Scanner in = new Scanner(System.in);
             int n = in .nextInt();
             in.close();
//End of code segment locked by HackerRank
            /*
            Literally a single line cast using the Integer.toString() method on int n read from stdio.
            Entire rest of this insane locked code is to prevent user doing anything else and can be ignored.
            */
             String s = Integer.toString(n);
//Start of code segment locked by HackerRank
             if (n == Integer.parseInt(s))
             {
                 System.out.println("Good job");
             }
             else
             {
                 System.out.println("Wrong answer.");
             }
         }
         catch (DoNotTerminate.ExitTrappedException e)
         {
             System.out.println("Unsuccessful Termination!!");
         }
     }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate
{
    public static class ExitTrappedException extends SecurityException
    {
        private static final long serialVersionUID = 1;
    }

    public static void forbidExit()
    {
        final SecurityManager securityManager = new SecurityManager()
        {
            @Override
            public void checkPermission(Permission permission)
            {
                if (permission.getName().contains("exitVM"))
                {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
//End of code segment locked by HackerRank
