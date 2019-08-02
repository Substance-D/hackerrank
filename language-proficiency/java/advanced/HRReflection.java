import java.util.*;
import java.lang.reflect.*;

public class HRReflection
{
    public static void main(String[] args)
    {
        /*
        These two lines are to be completed. You can create student as a class but
        in this case initialisaing it as an object will work also. HackerRank is hiding
        the actual Student class from you so you can't see and print out all the methods
        without using reflection. If you want to create student as a Class instance it
        looks like;

        Class student = Student.class

        studetnt.getClass().getDeclaredMethods() returns a Method array of all the methods
        for the Student class but none of the methods it inherits from any superclass
        Student inherits from. This is why getDeclaredMethods() is used and getMethods()
        causes an error.
        */
        Student student = new Student();
        Method[] methods = student.getClass().getDeclaredMethods();
        /*
        MethodList is an ArrayList of Strings to store the names of the methods. This is
        straightforwad as the Method objects have a method called getName which returns
        the Method name as a string. Afterwards the ArrayList simply needs to be sorted
        and printed.
        */
        ArrayList<String> methodList = new ArrayList<>();
        for(int i = 0; i < methods.length; i++)
        {
                methodList.add(methods[i].getName());
        }

        Collections.sort(methodList);
        for(String name: methodList)
        {
            System.out.println(name);
        }
    }
}
