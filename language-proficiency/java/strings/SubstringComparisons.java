//Start of code segment locked by HackerRank
import java.util.Scanner;

public class SubstringComparisons
{
//End of code segment locked by HackerRank
    public static String getSmallestAndLargest(String s, int k)
    {
        /*
        Create Strings for the largest and smalletst substrings, also a temporary String which will be used
        while searching for the largest and smallest substrings.

        The first loops iterates over the input String s for the largest substring. As a substring must be contiguous
        it's as simple as comparing subsequent substrings e.g. 0-3 compared to 1-4 etc. until the upperbound is equal
        to the final index of the String s.

        As the largest String starts off as empty then any substring will be larger than it when using .compareTo. Once this
        loop finishes the largest substring of size k will be found. The smallest substring can be found the same way by
        inverting the boolean condition to update temp. Smallest is set to largest initially to insure that it will be updated
        by a substring of s.
        */
        String smallest = "", largest = "", temp = "";
        for(int i = 0; i + k <= s.length(); i++)
        {
            temp = s.substring(i, i+k);
            if(temp.compareTo(largest) >= 0) largest = temp;
        }
        smallest = largest;
        for(int i = 0; i + k <= s.length(); i++)
        {
            temp = s.substring(i, i+k);
            if(temp.compareTo(smallest) < 0) smallest = temp;
        }

        return smallest + "\n" + largest;
    }
//Start of code segment locked by HackerRank
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
//End of code segment locked by HackerRank
