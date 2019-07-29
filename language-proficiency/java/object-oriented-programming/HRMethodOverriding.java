//Start of code segment locked by HackerRank
import java.util.*;

class Sports
{

    String getName()
    {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports
{
    @Override
    String getName()
    {
        return "Soccer Class";
    }
//End of code segment locked by HackerRank

/*
A method override is as simple as writing the exact same method signature in the child class. In this case literally all
that needs to be done is copy pasting the method from the Sports class and changing n to 11 in the print statement.
*/
    @Override
    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has 11 players in " + getName());
    }
//Start of code segment locked by HackerRank
}

public class HRMethodOverriding
{

    public static void main(String []args)
    {
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
	}
}
//End of code segment locked by HackerRank
