import java.util.Scanner;

public class StringReverse
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        String toReverse = scan.nextLine();
        scan.close();
        String reversed = "";
        for(int i = toReverse.length() - 1; i >= 0; i--) reversed += toReverse.charAt(i);
        if(toReverse.equals(reversed)) System.out.println("Yes");
        else System.out.println("No");

    }
}
