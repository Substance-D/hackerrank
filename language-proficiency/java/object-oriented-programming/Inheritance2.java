//Start of segment locked by HackerRank
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//End of segment locked by HackerRank

/*
Create a class called Arithmetic which doesn't require any input paramters for the constructor.
Create a method that returns an int called add which takes in two ints as paramters. Return the
result of adding the two ints.

Create a class Adder that extends Arithemetic and that's it. Adder could implement add instead of
Arithmetic or override the Arithmetic method if you like. This isn't checked at all.
*/
class Arithmetic
{
    public Arithmetic()
    {

    }

    public int add(int a, int b)
    {
        return a + b;
    }
}
class Adder extends Arithmetic
{

}
//Start of segment locked by HackerRank
public class Inheritance2
{
    public static void main(String []args)
    {
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
//End of segment locked by HackerRank
