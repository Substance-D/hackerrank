import java.util.Scanner;

public class Java_End_of_File
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(scan.hasNext())
        {
            System.out.println(++i + " " + scan.nextLine());
        }
    }
}
