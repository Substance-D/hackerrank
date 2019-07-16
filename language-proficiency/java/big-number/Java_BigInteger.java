import java.util.Scanner;
import java.math.BigInteger;

public class Java_BigInteger
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());
        BigInteger addition = a.add(b);
        BigInteger multiplication = a.multiply(b);
        System.out.println(addition.toString()+"\n"+multiplication.toString());


    }
}
