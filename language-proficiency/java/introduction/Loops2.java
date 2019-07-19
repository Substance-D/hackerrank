import java.util.Scanner;

public class Loops2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int rollingSequenceValue = a;
            for(int j = 0; j < n; j++)
            {
                int currentSequenceTerm = (int) (Math.pow(2,j) * b);
                System.out.print((rollingSequenceValue + currentSequenceTerm) + " ");
                rollingSequenceValue += currentSequenceTerm;
            }
            System.out.println();
        }
    }
}
