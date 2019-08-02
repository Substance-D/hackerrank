//Start of code segment locked by HackerRank
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//End of code segment locked by HackerRank

/*
The code is fairly simple and is just to introduce the varargs concept. This allows a single
method to take multiple paramters without overloading. For example a calculator's add function
should be able to add many integers without having to have endless overloading for each
amount of operands.
*/
class Add
{
    //Method prints not returns results. Parameters are how dynamic amount of integer inputs are handled.
    public void add(int ... args)
    {
        //String and in to store sum as well as print out equation
        String str = "";
        int sum = 0;
        //How to iterate over all inputs
        for(int x: args)
        {
            //Add sum of all inputs and appends values to a String for the equation.
            sum += x;
            str += x + "+";
        }
        //Printing a substring of str that cuts off the final "+" before appending "=" and the result
        System.out.println(str.substring(0,str.length()-1)  + "=" + sum);
    }
}
//Start of code segment locked by HackerRank
public class Varargs
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);
			ob.add(n1,n2,n3,n4,n5,n6);
			Method[] methods=Add.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());

			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
        }

        catch(Exception e)
        {
				e.printStackTrace();
        }
    }
}
//End of code segment locked by HackerRank
