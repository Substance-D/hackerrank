import java.util.Scanner;

public class Loops1
{
    public static void main(String args[])
    {
        //Stdio for input of N and then the most basic loop multiplication statement
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 1; i <= 10; i++) System.out.println(N + " x " + i + " = " + N*i);
    }
}
