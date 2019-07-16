import java.util.Scanner;

public class Java_Substring_Comparisons
{
    public static String getSmallestAndLargest(String s, int k)
    {
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

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
