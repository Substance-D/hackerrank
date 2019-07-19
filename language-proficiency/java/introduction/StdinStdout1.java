import java.util.Scanner;

public class StdinStdout1
{

    public static void main(String[] args)
    {
        //Create scanner for stdio, scan in three integers, print the three integers.
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        System.out.println(a + "\n" + b + "\n" + c);
    }
}
