import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class CurrencyFormatter
{
    public static void main(String args [])
    {
        //Scan in the payment value as a double using stdio
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();
        /*
        Create NumberFormat objects for the various currencies using the NumberForma.getCurrencyInstance() method. There are constant Locale values for the US, China, and France.
        For India a new Locale must be created, this can be done inline using the chosen language (en, English) and the country code
        (IN, India). Country codes can be found in the IANA Language Subtag Registry via Google search etc.
        */
        NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat currencyIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat currencyChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat currencyFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        //Print out the four currencies using the format method for the created NumberFormat objects with the payment variable as the parameter
        System.out.println("US: " + currencyUS.format(payment));
        System.out.println("India: " + currencyIndia.format(payment));
        System.out.println("China: " + currencyChina.format(payment));
        System.out.println("France: " + currencyFrance.format(payment));

    }
}
