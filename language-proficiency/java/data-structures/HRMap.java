/*
Create a scanner for stdio and a HashMap
*/

import java.util.Scanner;
import java.util.HashMap;

public class HRMap
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> myMap = new HashMap<>();
        int n = scan.nextInt();
        for(int i = 0; i < n; i++)
        {
            myMap.put(scan.nextLine(), scan.nextLine());
        }
        while(scan.hasNext())
        {
            System.out.println(myMap.getOrDefault(scan.nextLine(), "Not found"));
        }
    }
}
