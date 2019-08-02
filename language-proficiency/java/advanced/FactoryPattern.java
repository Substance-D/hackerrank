//Start of code segment locked by HackerRank
import java.util.*;
import java.security.*;
interface Food
{
    public String getType();
}

class Pizza implements Food
{
    public String getType()
    {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food
{
    public String getType()
    {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory
{
    public Food getFood(String order)
    {
//End of code segment locked by HackerRank

        /*
        All that needs to be done is return either type Cake or
        type Pizza depending on the String passed to the getFood
        method. This is the nature of how factories work. By
        creating an objecto of a given class
        */
        if(order.equals("cake")) return new Cake();
        else return new Pizza();
//Start of code segment locked by HackerRank
    }
}

public class FactoryPattern
{
    public static void main(String args[])
    {
        Do_Not_Terminate.forbidExit();

        try
        {
            Scanner sc=new Scanner(System.in);
			//creating the factory
			FoodFactory foodFactory = new FoodFactory();

			//factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());


			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
        }
		catch (Do_Not_Terminate.ExitTrappedException e)
        {
            System.out.println("Unsuccessful Termination!!");
		}
    }
}

class Do_Not_Terminate
{
    public static class ExitTrappedException extends SecurityException
    {
        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit()
    {
        final SecurityManager securityManager = new SecurityManager()
        {
            @Override
            public void checkPermission(Permission permission)
            {
                if(permission.getName().contains("exitVM"))
                {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
//End of code segment locked by HackerRank
