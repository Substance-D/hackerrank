//Start of segment locked by HackerRank
import java.util.*;
interface AdvancedArithmetic
{
  int divisor_sum(int n);
}
//End of segment locked by HackerRank

/*
Create a class MyCalculator that implements the AdvancedArithmetic interface. An
interface is like an abstract class but only contains abstract methods. All methods
of the interface must be implemented. In this case there is only a single method to
implement the divisor_sum method.

Implement this method in the MyCalculator class making sure to match the method
signature from the interface. It's simple enough to get the sum of divisors for a
value n. Simply loop from 1-n(inclusive) and add any values for the loop variable
that divide into n with a remainder of 0 using modulo. Don't start trying to divide
with 0 or forget to inlude <=n as the loop boundary as every number is one of its
own divisors.
*/
class MyCalculator implements AdvancedArithmetic
{
    public MyCalculator()
    {

    }
    public int divisor_sum(int n)
    {
        int sumOfDivisors = 0;
        for(int i = 1; i <= n; i++) if(n % i == 0) sumOfDivisors += i;
        return sumOfDivisors;
    }
}
//Start of segment locked by HackerRank
class Solution
{
    public static void main(String []args)
    {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o)
    {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++)
        {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
//End of segment locked by HackerRank
