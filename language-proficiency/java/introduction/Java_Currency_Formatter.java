import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Java_Currency_Formatter
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();
        NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat currencyIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat currencyChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat currencyFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + currencyUS.format(payment));
        System.out.println("India: " + currencyIndia.format(payment));
        System.out.println("China: " + currencyChina.format(payment));
        System.out.println("France: " + currencyFrance.format(payment));

    }
}
