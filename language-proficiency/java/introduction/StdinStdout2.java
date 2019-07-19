import java.util.Scanner;

public class StdinStdout2 {

    public static void main(String[] args)
    {
        //Create scanner for IO and scan in the integer and double values
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        /*
        Java scanner is bad at handling numerical imput followed by string input as the numerical inputs don't consume the new line character
        therefore often it is necessary to manually consume that character before scanning in the actual string value. Alternatively you can
        scan in the integer and double values as strings and parse them to their relevant datatypes e.g. int i = Integer.parseInt(scan.nextLine());
        */
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
