import java.util.Scanner;
import java.math.BigInteger;

public class PrimalityTest
{
    public static void main(String args [])
    {
        /*
        Solution is as simple as creating a BigInteger from stdio and calling the isProbablePrime() method. A ternary operator is used
        to print prime or not prime based on the boolean value returned by the isProbablePrime() method
        */
        Scanner scan = new Scanner(System.in);
        BigInteger n = new BigInteger(scan.nextLine());
        scan.close();
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime" );

    }
}
