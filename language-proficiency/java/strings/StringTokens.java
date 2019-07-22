import java.io.*;

public class Solution
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String toSplit = scan.nextLine().trim();
        String[] tokens = toSplit.split("[!,?._'@\\s]+");
        if(toSplit.length() > 0)
        {
            System.out.println(tokens.length);
            for(int i = 0; i < tokens.length; i++)
            {
                System.out.println(tokens[i].trim());
            }
        }
        else System.out.println(0);

        scan.close();
    }
}
