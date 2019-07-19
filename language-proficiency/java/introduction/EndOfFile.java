import java.util.Scanner;

public class EndOfFile
{
    public static void main(String args[])
    {
        //Create scanner to handle stdio and int to print out line numbers
        Scanner scan = new Scanner(System.in);
        int i = 0;
        /*
        While Scanner.hasNext() reads input while there is data in the buffer to read and is the method designed for
        reading in an unknown amount of input. It returns a boolean value depending if there is data still to be read
        in the buffer or not. Setting up a while loop using this condition allows for dynamic input reading.
        */
        while(scan.hasNext())
        {
            //i is the line number, 1++ means it will be printed then incremented. Alternativly initialise i to -1 and use i++
            System.out.println(++i + " " + scan.nextLine());
        }
    }
}
