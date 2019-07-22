//Start of code segment locked by HackerRank
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
//End of code segment locked by HackerRank
class Result
{
    // Create a static ArrayList for all the days of the week in plain English uppercase
    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
    /*
    Create the method for finding the day which will be called by the locked HackerRank main method with the signature
    for three integers representing month, day, and year respectively.
    */
    public static String findDay(int month, int day, int year)
    {
        //Create a calendar object
        Calendar calendar = Calendar.getInstance();
        //Set the year, month and day of the calendar. Month field is 0 indexed but user will be putting Jan as 1 etc.
        calendar.set(year, month-1, day);
        //Set p to be the value for day of the week of the created calendar
        int p = calendar.get(Calendar.DAY_OF_WEEK);
        //As the array is 0 indexed we need to get index p - 1 to get the correlating day. Return the String for actualDayName
        String actualDayName = days.get(p-1);
        return actualDayName;
    }
}
//Start of code segment locked by HackerRank
public class DateAndTime
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
//End of code segment locked by HackerRank
