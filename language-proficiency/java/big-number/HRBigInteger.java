import java.util.Scanner;
import java.math.BigInteger;

public class HRBigInteger
{
    public static void main(String args [])
    {
        //Solution is simple as creating two BigInteger objects from stdio then calling .add() and .multiply() methods in a print statement
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());
        BigInteger addition = a.add(b);
        BigInteger multiplication = a.multiply(b);
        System.out.println(addition.toString()+"\n"+multiplication.toString());


    }
}
