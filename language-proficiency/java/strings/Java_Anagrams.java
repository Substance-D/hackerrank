import java.util.Scanner;
import java.util.Arrays;

public class Java_Anagrams
{

    static boolean isAnagram(String a, String b)
    {
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
