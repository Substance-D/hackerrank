import java.util.Scanner;

public class StringReverse
{
    public static void main(String args [])
    {
        //Created scanner for stdio and read in the String to reverse
        Scanner scan = new Scanner(System.in);
        String toReverse = scan.nextLine();
        scan.close();
        //Empty String that will have chars added to it from toReverse in reverse order
        String reversed = "";
        //Loop over toReverse from the final char index and add it to reverse. This will give you a reverse String
        for(int i = toReverse.length() - 1; i >= 0; i--) reversed += toReverse.charAt(i);
        //If the two Strings are equal then the original String was a palindrome
        if(toReverse.equals(reversed)) System.out.println("Yes");
        else System.out.println("No");

    }
}
