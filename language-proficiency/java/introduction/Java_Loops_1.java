import java.util.Scanner;

public class Java_Loops_1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 1; i <= 10; i++) System.out.println(N + " x " + i + " = " + N*i);
    }
}