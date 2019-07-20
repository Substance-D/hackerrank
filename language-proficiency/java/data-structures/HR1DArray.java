
//Start of code segment locked by HackerRank
import java.util.*;

public class Solution
{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//End of code segment locked by HackerRank
        /*Create an int array of size n, array must be called n because of locked HackerRank code below.
        Loop through the array filling each spot with a scanned integer.
        */
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) a[i] = scan.nextInt();
//Start of code segment locked by HackerRank
        scan.close();


        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
//End of code segment locked by HackerRank
