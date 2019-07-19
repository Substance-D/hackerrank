import java.io.*;
import java.util.*;

public class StringsIntroduction
{
    public static void main(String[] args)
    {
        //Stdio for scanning in input Strings A and B
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine(), B = scan.nextLine();

        //Print out sum of A and B String lengths
        System.out.println(A.length() + B.length());

        /*
        this.compareTo(x) compares this String and String x lexicographically. If the value is 0 the strings are equal, >0 and this String is lexicographically greater,
        and if the value is <0 x is lexicographically than this String. If A is greater print "Yes" or if lesser or equal to B print "No"
        */
        if(A.compareTo(B) > 0) System.out.println("Yes");
        else System.out.println("No");

        /*
        To print the first letter of each string print a substring with .toUpperCase() on a substring of only the first char of the String followed
        by a substring of the rest of the string as is (or toLowerCase() if required)
        */
        System.out.print(A.substring(0,1).toUpperCase() + A.substring(1) + " ");
        System.out.print(B.substring(0,1).toUpperCase() + B.substring(1));
    }
}
