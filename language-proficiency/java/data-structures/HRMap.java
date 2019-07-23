/*
Create a Scanner to handle stdio
Create a HashMap with keys for Strings and Integers for values, both as Strings will fail on timeout in Java 8
SCan in n for entries to the phone book
Iterate to n scanning in integers and strings and putting them in the HashMap myMap
Integer.parseInt() used due to Java's awkwardness when changing from scanning numeric to text values etc.
Use while(scan.hasNext()) to read from buffer as long as there are inputs due to no given value for queries
Check if myMap contains a given key, if it does printout that key followed by its value
Otherwise print "Not found"
*/

import java.util.Scanner;
import java.util.HashMap;

public class HRMap
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> myMap = new HashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < n; i++)
        {
            String name = scan.nextLine();
            int number = Integer.parseInt(scan.nextLine());
            myMap.put(name, number);
        }
        String temp;
        while(scan.hasNext())
        {
            temp = scan.nextLine();
            if(myMap.containsKey(temp)) System.out.println(temp + "=" + myMap.get(temp));
            else System.out.println("Not found");
        }
    }
}
