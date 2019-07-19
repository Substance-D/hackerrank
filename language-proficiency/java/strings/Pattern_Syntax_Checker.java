import java.util.Scanner;
import java.util.regex.*;

public class Pattern_Syntax_Checker
{
	public static void main(String[] args){
        //SCan in int for amount of test cases using string parse to consume newline character
		Scanner scan = new Scanner(System.in);
		int testCases = Integer.parseInt(scan.nextLine());
        //loop for handling each testcase
		for(int i = 0; i < testCases; i++)
        {
            /*
            Try-catch block for pattern. If a pattern is valid it will compile fine and "Valid" can be printed then
            if the compile method fails then the catch statement will print "Invalid"
            */
          	try
            {
                Pattern p = Pattern.compile(scan.nextLine());
                System.out.println("Valid");
            }
            catch(Exception e)
            {
                System.out.println("Invalid");
            }
		}
	}
}
