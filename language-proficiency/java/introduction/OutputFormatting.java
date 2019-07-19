import java.util.Scanner;

public class OutputFormatting
{
    public static void main(String[] args)
    {
        //Scanner for stdio as well as required border of '='
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        //Three string and integer pairs will be supplied for formatting
        for(int i = 0; i < 3; i++)
        {
            //Scan in the string and integer pair.
            String str = scan.next();
            int x = scan.nextInt();
            /*
            The printf function allows for formatting of strings. The first paramter is the string to be printed with the % symbols indicate
            special actions.
            %n creates a new line character at the end of the created string
            %d inserts the provided integer argument in the formatted string in this case x
            %03d is the same as above but prepends the integer value with 0s until it's of length (or any number)
            %s is the placeholder for the provided string value in the argument in this case str
            -left justifies the string and 15 means the string will be padded to length 15
            Therefore the string is formatted as the string str formatted to the left padded to 15 length followed by the value of x
            padded to be three digits long with 0s and finally a new line character
            */

            System.out.printf("%-15s%03d%n", str, x);
        }
        //Finall print out the bottom border of '='
        System.out.println("================================");
    }
}
