//Start of code segment locked by HackerRank
import java.util.Scanner;
//End of code segment locked by HackerRank
class UsernameValidator
{
    /*
    Strings have a match() method so they can be directly matched against a regex string without any
    patterns or compiling etc. The main method will have the input strings call .match() against the
    regularExpression String therefore it simply needs to be the regex to match the question parameters.

    ^ represents the start of the string
    $ represents the end of the string
    [a-zA-Z] represents all alpahbetic characters as the string must start with them
    [0-9] represents all numeric characters
    _ represents the underscore
    The second [..] represents all alphanumeric characters and the underscore as these characters are all valid
    after the first character of the string
    {x,y} minimum of 7 characters and maximum of 29. As the first [..] specifies a single character as it has no
    length modifier. As the overall string must be length 8-30.

    */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

//Start of code segment locked by HackerRank
public class ValidUsernameRegex
{
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0)
        {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression))
            {
                System.out.println("Valid");
            }

            else
            {
                System.out.println("Invalid");
            }
        }
    }
}
//End of code segment locked by HackerRank
