import java.util.Scanner;

public class Substring
{
    public static void main(String[] args)
    {
        //Scanner for stdio and scan in a string. scan integers start and end, output a substring of S using start and end as indices
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();
        System.out.println(S.substring(start, end));
    }
}
