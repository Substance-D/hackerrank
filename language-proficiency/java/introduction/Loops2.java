import java.util.Scanner;

public class Loops2
{
    public static void main(String args[])
    {
        //Stdio to scan in total amount of sequences to be generated.
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            //Read in three inputs for generating the sequence and initialise rollingSequence value to a as it's used to track sequence values.
            int a = scan.nextInt(), b = scan.nextInt(), n = scan.nextInt(), rollingSequenceValue = a;
            //Loop set to n as this loop is generating n steps of the given sequence
            for(int j = 0; j < n; j++)
            {
                //Generates latest sequence term. Or rather new value to be added to previous sequence term for current sequence term.
                int currentSequenceTerm = (int) (Math.pow(2,j) * b);
                System.out.print((rollingSequenceValue + currentSequenceTerm) + " ");
                rollingSequenceValue += currentSequenceTerm;
            }
            //new line before next generated sequence
            System.out.println();
        }
    }
}
