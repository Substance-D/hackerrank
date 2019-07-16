import java.util.Scanner;
import java.math.BigInteger;

public class Java_Primality_Test
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        BigInteger n = new BigInteger(scan.nextLine());
        scan.close();
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime" );

    }
}
