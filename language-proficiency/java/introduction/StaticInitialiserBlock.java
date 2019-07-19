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
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean flag = false;
    static
    {
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
