import java.io.*;

public class Solution
{

    public static void main(String[] args)
    {
        //Scanner to handle stdio
        Scanner scan = new Scanner(System.in);
        //Scan in input as String and trim leading and trailing whitespace
        String toSplit = scan.nextLine().trim();
        //Split the string into smaller Strings using a regex as delimiter based on question paramters
        String[] tokens = toSplit.split("[!,?._'@\\s]+");
        //Check length of String is greater than 0 in case input string was all whitespace and trimmed
        if(toSplit.length() > 0)
        {
            //Print length of array for number of tokens and then elements of tokens array
            System.out.println(tokens.length);
            for(int i = 0; i < tokens.length; i++)
            {
                System.out.println(tokens[i].trim());
            }
        }
        //If the string was empty print length 0 and no tokens to print
        else System.out.println(0);

        scan.close();
    }
}
