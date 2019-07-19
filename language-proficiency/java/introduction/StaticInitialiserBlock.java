//Start of code segment locked by HackerRank
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitialiserBlock
{
//End of code segment locked by HackerRank
    static Scanner scan = new Scanner(System.in);
    //To use a static block first you created all the static variables and THEN use them in the static block
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    //Initialise flag as false so in the the main method the area will not be computed and printed unless the flag is set to true
    static boolean flag = false;
    //create the static block
    static
    {
        //If breadth or height are <=0 it cannot be a shape therefore print the error message otherwise set flag to true to compute area in main
        if(B <= 0 || H <= 0) System.out.println("java.lang.Exception: Breadth and height must be positive");
        else flag = true;
    }
//Start of code segment locked by HackerRank
    public static void main(String[] args)
    {
        if(flag)
        {
            int area = B * H;
			System.out.print(area);
        }
    }
}
//End of code segment locked by HackerRank
