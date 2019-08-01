import java.util.*;
import java.lang.reflect.*;

public class HRReflection
{
    public static void main(String[] args)
    {
        Student student = new Student();
        Method[] methods = student.getClass().getDeclaredMethods();

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
