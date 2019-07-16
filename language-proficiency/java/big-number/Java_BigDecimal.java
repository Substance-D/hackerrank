import java.util.Scanner;
import java.math.BigDecimal;
import java.util.Hashtable;

public class Java_BigDecimal
{
    public static void main(String args [])
    {
        Hashtable<BigDecimal, Integer> decimalLengths = new Hashtable<BigDecimal, Integer>();

        Scanner scan = new Scanner(System.in);

        String temp;

        temp = scan.nextLine();
        BigDecimal a = new BigDecimal(temp);
        decimalLengths.put(a, temp.length());
        /*
        temp = scan.nextLine();
        BigDecimal b = new BigDecimal(temp);
        decimalLengths.put(b, temp.length());
        */
        Integer n = decimalLengths.get(a);
        Integer nprime = a.toString().length();
        System.out.println(n + " " + nprime);




    }
}
