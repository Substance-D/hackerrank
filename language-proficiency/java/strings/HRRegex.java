//Start of code segment locked by HackerRank
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class HRRegex
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {
            String IP = scan.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
//End of code segment locked by HackerRank
/*
IO is handled so all that has to be written is a class MyRegex with a String that will be
matched against in the main method.

Once you realise that you can have OR statements in th regex it becomes trivial to set up
? means one or none

Then simply have "0-1" "any digit" "any digit"
2 "any digit" ...
25 ...
*/
class MyRegex
{
    String pattern =
        "^([0-1]?([0-9][0-9])?|2[0-4][0-9]|25[0-5])\\."
        "([0-1]?([0-9][0-9])?|2[0-4][0-9]|25[0-5])\\."
        "([0-1]?([0-9][0-9])?|2[0-4][0-9]|25[0-5])\\."
        "([0-1]?([0-9][0-9])?|2[0-4][0-9]|25[0-5])$";
}
