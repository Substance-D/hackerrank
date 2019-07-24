
//Start of code segment locked by HackerRank
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRHashset
{

 public static void main(String[] args)
 {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++)
        {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
//End of code segment locked by HackerRank
        /*
        Most of the code is locked in HackerRank. Input of pairs is two String arrays with the first half
        of the pair in pair_left and the second in pair_right. It's as simple as adding each pair concatenated
        separated by a " " as the question states we don't have to worry about (a, b) being the same as (b, a).
        So it's really just a HashSet of Strings. Adding Strings to a HashSet only adds if the value doesn't
        already exist in the HashSet. Therefore iterate over the pair arrays fusing the STrings and adding them
        each time printing the size of the HashSet which is the amount of items it currently has AKA the unique
        pairs
        */
        HashSet<String> myHS = new HashSet<>();
        for(int k = 0; k < pair_left.length; k++)
        {
            myHS.add(pair_left[k] + " " + pair_right[k]);
            System.out.println(myHS.size());
        }
        //Start of code segment locked by HackerRank
    }
}
//End of code segment locked by HackerRank
