//Start of code segment locked by HackerRank
import java.util.Scanner;
import java.util.Arrays;

public class Anagrams
{
//End of code segment locked by HackerRank
    static boolean isAnagram(String a, String b)
    {
        /*
        The solution only requires the method comparing two Strings to be completed. To check if
        two strings are anagrams they must have the exact same chars. In this case we are looking
        for plain English chars so case is irrelevant. Therefore casting each String to uppercase
        and then creating char arrays.

        Once the arrays are created they can be sorted then simply iterate over them comparing the same
        indices to check for matches. If there is a single nonmatch then the Strings are not anagrams.
        There is no error handling for if the Strings are different lengths etc.

        Note: I added an import for java.util.Arrays but this is locked and unavailable in HackerRank
        in which case use java.util.Arrays.sort() in the code.
        */
        char[] aLetters = a.toUpperCase().toCharArray();
        char[] bLetters = b.toUpperCase().toCharArray();
        Arrays.sort(aLetters);
        Arrays.sort(bLetters);
        if(aLetters.length == bLetters.length)
        {
            for(int i = 0; i < aLetters.length; i++)
            {
                if(aLetters[i] != bLetters[i])
                return false;
            }
            return true;
        }
        else return false;

    }
//Start of code segment locked by HackerRank
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
//End of code segment locked by HackerRank
