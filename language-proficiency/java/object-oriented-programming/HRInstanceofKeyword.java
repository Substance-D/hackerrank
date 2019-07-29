/*
The code isn't locked but can be left as is as only three lines need to be lightly modified
*/

import java.util.*;

class Student{}
class Rockstar{}
class Hacker{}


public class HRInstanceofKeyword
{
    static String count(ArrayList mylist)
    {
        int a = 0,b = 0,c = 0;
        for(int i = 0; i < mylist.size(); i++)
        {
            Object element=mylist.get(i);
            /*
            All lines are the same, element is an object. Use the "instanceof" keyword
            to check which type of object element is. Increment accordingly.
            */
            if(element instanceof Student) a++;
            if(element instanceof Rockstar) b++;
            if(element instanceof Hacker) c++;
        }

        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }

     public static void main(String []args)
     {
         ArrayList mylist = new ArrayList();
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         for(int i=0; i<t; i++)
         {
             String s=sc.next();
             if(s.equals("Student")) mylist.add(new Student());
             if(s.equals("Rockstar")) mylist.add(new Rockstar());
             if(s.equals("Hacker")) mylist.add(new Hacker());
         }
         System.out.println(count(mylist));
     }
 }
