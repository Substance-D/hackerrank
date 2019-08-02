/*
This problem simply expects you to create six classes which return specified Strings.
Flower is the superclass of both Jasmine and Lily and both classes override the
whatsYourName() method with their own implementations.

Covariant return type just means that a superclass can be declared and then initialised
as a different subclass based on an if statement. So a Region called region is created
then set to either WestBengal or AndhraPradesh depending on the switch statement.

Note: The question diagram shows Lotus but it should be Lily.
*/
//Start of code segment locked by HackerRank
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//End of code segment locked by HackerRank
class Flower
{
    String whatsYourName()
    {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower
{
    String whatsYourName()
    {
        return "Jasmine";
    }
}

class Lily extends Flower
{
    String whatsYourName()
    {
        return "Lily";
    }
}

class Region
{
    Flower yourNationalFlower()
    {
        return new Flower();
    }
}

class WestBengal extends Region
{
    Jasmine yourNationalFlower()
    {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region
{
    Lily yourNationalFlower()
    {
        return new Lily();
    }
}

//Start of code segment locked by HackerRank
public class CovariantReturnTypes
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s)
        {
            case "WestBengal":
            region = new WestBengal();
            break;

            case "AndhraPradesh":
            region = new AndhraPradesh();
            break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
//End of code segment locked by HackerRank
