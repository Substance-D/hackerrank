import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //Pretty straightforward ifelse statement. Can take some time to figure out how to reduce the multiple conditions to two statements.
        if(N % 2 ==1 || (N < 21 && N > 5)) System.out.println("Weird");
        else System.out.println("Not Weird");
        scanner.close();
    }
}
